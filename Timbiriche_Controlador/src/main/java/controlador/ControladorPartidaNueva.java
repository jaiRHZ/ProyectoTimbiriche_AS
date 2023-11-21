/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import aplicacion.ApPartidaNueva;
import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import test.TableroData;
import vista.PartidaNueva;
/**
 *
 * @author Jorge
 */
public class ControladorPartidaNueva implements ActionListener{
    
    PartidaNueva partidaNueva;
    TableroData tableroData;
//    List listaJugadores = new ArrayList();
    ApPartidaNueva apPartidaNueva;
    int idPartida = 0;
    String codigoPartida;
    private Jugador lider;
    int dimension;

    public ControladorPartidaNueva() {
    }
    
    public ControladorPartidaNueva(Jugador lider) {
        idPartida++;
        this.lider = lider;
        apPartidaNueva = new ApPartidaNueva();
        partidaNueva = new PartidaNueva();
        tableroData = new TableroData();
        tableroData.agregarObservador(partidaNueva);
        tableroData.setLider(lider);
        codigoPartida = apPartidaNueva.generarCodigo();
        tableroData.setCodigoPartida(codigoPartida);
        partidaNueva.setCargarInfo(tableroData);      
        this.generarEventosConfiguracion();
    }
    
    private void generarEventosConfiguracion() {
        this.partidaNueva.btnDiez.addActionListener(this);
        this.partidaNueva.btnVeinte.addActionListener(this);
        this.partidaNueva.btnTreinta.addActionListener(this);
        this.partidaNueva.btnComenzar.addActionListener(this);
    }
    
    public void mostrarPantalla(){
        partidaNueva.setVisible(true);
    }
    
    public int dimensionSeleccionada(){
        
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JButton botonPresionado = (JButton) e.getSource();
                dimension = Integer.parseInt(e.getActionCommand());
                System.out.println("DIMENSION: "+dimension);
            }
        };
        return dimension;
    }
    
    public void jugadoresListos(boolean listos){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()!= "Comenzar"){
            dimension = Integer.parseInt(e.getActionCommand());
            System.out.println("DIMENSION: "+e.getActionCommand());
        }else{
            //LOGICA PARA COMENZAR PARTIDA
            System.out.println("COMENZAR");
        }
    }
    
    public void comenzarPartidaNueva(boolean listo){

        if (listo == true){
            ControladorTablero controladorTablero = new ControladorTablero(dimensionSeleccionada(), tableroData.getJugadores());
            controladorTablero.iniciar();
            //Se envia true a la pantalla de lobby de espera para indicar que
            //la partida ha comenzado y que muestre el tablero.
        }
    }
    
    /* Este metodo se utiliza cuando un jugador se sale de la partida.
    */
    public void removerJugador(Jugador jugador){
        for (int i = 0; i < tableroData.getJugadores().size(); i++) {
            if(tableroData.getJugadores().get(i).equals(jugador)){
                tableroData.getJugadores().remove(i);
            }
        }
    }
    
    public void nuevoJugador(Jugador jugador){
        if (tableroData.getJugadores() == null || tableroData.getJugadores().size() < 3){
            tableroData.agregarJugador(jugador);
            partidaNueva.nombreJ4.setText(this.lider.getNombre());
            //SE MUESTRA LA PANTALLA DEL LOBBY.
            //--------------------------------------------------------------------
            /* Se obtiene la posicion en la lista del jugador para poder asignarle
            un espacio en la pantalla. */
            int posicionLista = tableroData.getJugadores().indexOf(jugador)+1;
            switch (posicionLista) {
                case 1:
                    partidaNueva.nombreJ1.setText(jugador.getNombre());
                    //SE REGISTRA LA IMAGEN DE PERFIL
                    break;
                case 2:
                    partidaNueva.nombreJ2.setText(jugador.getNombre());
                    //SE REGISTRA LA IMAGEN DE PERFIL
                    break;
                case 3:
                    partidaNueva.nombreJ3.setText(jugador.getNombre());
                    //SE REGISTRA LA IMAGEN DE PERFIL
                    break;
            }
            
        }else{
            //Se muestra un cuadro de dialogo al jugador que solicita entrar 
            //indicando que la partida esta llena.
//            JOptionPane.showMessageDialog(null);
        }
    }
    
    //ESTO VA EN EL CONTROL DE LA PANTALLA DE LOBBY ESPERA
//    public void jugadoresListos(boolean listo){
//        comenzarPartidaNueva(td);
//    }

    
    
}
