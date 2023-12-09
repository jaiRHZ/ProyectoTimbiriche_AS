/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import aplicacion.TableroData;
import vista.PartidaNueva;

/**
 *
 * @author Jorge
 */
public class ControladorPartidaNueva implements ActionListener {

    PartidaNueva partidaNueva;
    TableroData tableroData;
    Integer dimension;
    ControladorTablero controladorTablero;

    public ControladorPartidaNueva() {
    }

    public ControladorPartidaNueva(TableroData tablero) {
        this.tableroData = tablero;
        this.partidaNueva = new PartidaNueva();
        this.tableroData.agregarObservador(partidaNueva);
        this.generarEventosConfiguracion();

    }

    private void generarEventosConfiguracion() {
        this.partidaNueva.btnDiez.addActionListener(this);
        this.partidaNueva.btnVeinte.addActionListener(this);
        this.partidaNueva.btnTreinta.addActionListener(this);
        this.partidaNueva.btnComenzar.addActionListener(this);
    }

    public void iniciarPantalla() {
        this.tableroData.iniciarJugador();
        this.partidaNueva.setCargarInfo(this.tableroData);
        this.partidaNueva.setVisible(true);
        this.tableroData.mandarJugadorPrincipal();

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

    public void comenzarPartidaNueva(boolean listo) {
        if (listo == true) {
            this.controladorTablero = new ControladorTablero(dimension, tableroData);
            controladorTablero.iniciar();
            partidaNueva.dispose();

        }
    }
}
