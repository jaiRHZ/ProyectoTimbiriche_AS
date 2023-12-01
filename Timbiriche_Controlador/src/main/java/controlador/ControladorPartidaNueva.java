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
import javax.swing.JOptionPane;
import aplicacion.TableroData;
import javax.swing.JLabel;
import vista.PartidaNueva;

/**
 *
 * @author Jorge
 */
public class ControladorPartidaNueva implements ActionListener {

    PartidaNueva partidaNueva;
    TableroData tableroData;
    List<Jugador> listaJugadores;
    ApPartidaNueva apPartidaNueva;
    int idPartida = 0;
    String codigoPartida;
    private Jugador lider;
    Integer dimension;
    ControladorTablero controladorTablero;
//    Jugador jugador;
    private JLabel[] labels;
    

    public ControladorPartidaNueva() {
    }

    public ControladorPartidaNueva(TableroData tablero) {
        idPartida++;
        this.tableroData = tablero;
        this.lider = tableroData.getJugadorPrincipal();
        apPartidaNueva = new ApPartidaNueva(tableroData);
        partidaNueva = new PartidaNueva();
        this.tableroData.agregarObservador(partidaNueva);
        this.tableroData.setJugadorPrincipal(lider);
        codigoPartida = apPartidaNueva.generarCodigo();
        this.tableroData.setCodigoPartida(codigoPartida);
        this.generarEventosConfiguracion();
        this.listaJugadores =  new ArrayList(); 
        labels = new JLabel[4];
        labels[0] = this.partidaNueva.nombreJ1;
        labels[1] = this.partidaNueva.nombreJ2;
        labels[2] = this.partidaNueva.nombreJ3;
        labels[3] = this.partidaNueva.nombreJ4;
        
        
    }

    private void generarEventosConfiguracion() {
        this.partidaNueva.btnDiez.addActionListener(this);
        this.partidaNueva.btnVeinte.addActionListener(this);
        this.partidaNueva.btnTreinta.addActionListener(this);
        this.partidaNueva.btnComenzar.addActionListener(this);
    }

    public void iniciarPantalla() {
        this.partidaNueva.setCargarInfo(this.tableroData);
        mostrarJugadores();
        this.partidaNueva.setVisible(true);
        
    }

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
            if (dimension == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una dimensión primero");
            } else {
                System.out.println("COMENZAR");
                this.controladorTablero = new ControladorTablero(dimension, tableroData);
                controladorTablero.iniciar();
                partidaNueva.dispose();
            }

        }
    }
    
    /*Cuando se ingresa el nuevo jugador. Cuando un jugador crea una partida
    se invoca este metodo para ingresarlo a la lista. */
    public boolean nuevoJugador(Jugador jugador){
        if(this.tableroData.getJugadores().isEmpty() || tableroData.getJugadores().size() < 4){
            this.tableroData.agregarJugador(jugador);
            if(this.tableroData.getJugadores().size() == 1){
                System.out.println("Jug: "+jugador.getNombre());
                this.tableroData.setJugadorPrincipal(this.tableroData.getJugadores().get(0));
                mostrarJugadores();
            }
            mostrarJugadores();
            return true;
        }else{
            return false;
        }
    }
    
    public void mostrarJugadores(){
        for (int i = 0; i < this.tableroData.getJugadores().size(); i++) {
            if(labels[i].getText().isEmpty() || labels[i].getText() == null){
                labels[i].setText(this.tableroData.getJugadores().get(i).getNombre());
            }
        }
    }
    
    public void comenzarPartidaNueva(boolean listo) {

        if (listo == true) {
            this.controladorTablero = new ControladorTablero(dimension, tableroData);
            controladorTablero.iniciar();
            partidaNueva.dispose();

            //Se envia true a la pantalla de lobby de espera para indicar que
            //la partida ha comenzado y que muestre el tablero.
        }
    }
}
