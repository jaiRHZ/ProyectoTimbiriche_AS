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
public class ControladorPartidaNueva implements ActionListener {

    PartidaNueva partidaNueva;
    TableroData tableroData;
//    List listaJugadores = new ArrayList();
    ApPartidaNueva apPartidaNueva;
    int idPartida = 0;
    String codigoPartida;
    private Jugador lider;
    int dimension;
    ControladorTablero controladorTablero;

    public ControladorPartidaNueva() {
    }

    public ControladorPartidaNueva(TableroData tablero) {

        idPartida++;
        this.tableroData = tablero;
        this.lider = tableroData.getJugadorPrincipal();
        apPartidaNueva = new ApPartidaNueva();
        partidaNueva = new PartidaNueva();
        this.tableroData.agregarObservador(partidaNueva);
        this.tableroData.setJugadorPrincipal(lider);
        codigoPartida = apPartidaNueva.generarCodigo();
        this.tableroData.setCodigoPartida(codigoPartida);
        this.generarEventosConfiguracion();
    }

    private void generarEventosConfiguracion() {
        this.partidaNueva.btnDiez.addActionListener(this);
        this.partidaNueva.btnVeinte.addActionListener(this);
        this.partidaNueva.btnTreinta.addActionListener(this);
        this.partidaNueva.btnComenzar.addActionListener(this);
    }

    public void iniciarPantalla() {
        partidaNueva.setCargarInfo(this.tableroData);
        partidaNueva.setVisible(true);
    }

//    public int dimensionSeleccionada() {
//
//        ActionListener actionListener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                JButton botonPresionado = (JButton) e.getSource();
//                dimension = Integer.parseInt(e.getActionCommand());
//                System.out.println("DIMENSION: " + dimension);
//            }
//        };
//        return dimension;
//    }

    public void jugadoresListos(boolean listos) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() != "Comenzar") {
            dimension = Integer.parseInt(e.getActionCommand());
            System.out.println(dimension);
            System.out.println("DIMENSION: " + e.getActionCommand());
        } else {
            //LOGICA PARA COMENZAR PARTIDA
            System.out.println("COMENZAR");
            this.controladorTablero = new ControladorTablero(dimension, tableroData);
            controladorTablero.iniciar();
        }
    }

    public void comenzarPartidaNueva(boolean listo) {

        if (listo == true) {
            this.controladorTablero = new ControladorTablero(dimension, tableroData);
            controladorTablero.iniciar();
            //Se envia true a la pantalla de lobby de espera para indicar que
            //la partida ha comenzado y que muestre el tablero.
        }
    }

    /* Este metodo se utiliza cuando un jugador se sale de la partida.
     */
    public void removerJugador(Jugador jugador) {
        for (int i = 0; i < tableroData.getJugadores().size(); i++) {
            if (tableroData.getJugadores().get(i).equals(jugador)) {
                tableroData.getJugadores().remove(i);
            }
        }
    }
    
    public void nuevoJugador(Jugador jugador){
        tableroData.agregarJugador(jugador);
        cargarInfoTablero(jugador);
    }
    
    public void setNombresLabels(){
        for (int i = 0; i < tableroData.getJugadores().size(); i++) {
            
        }
    }
    
    public void cargarInfoTablero(Jugador jugador){
        if (tableroData.getJugadores().size() <= 4) {
            System.out.println("ENTRE");
//            partidaNueva.nombreJ4.setText(this.lider.getNombre());
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
                case 4:
                partidaNueva.nombreJ4.setText(jugador.getNombre());
                //SE REGISTRA LA IMAGEN DE PERFIL
                break;
                
            }

        } else {
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
