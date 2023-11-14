/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import modelo.Jugador;
import modelo.Punto;
import modelo.TableroData;
import vista.Configuracion;
import vista.Tablero;
import vista.TableroPanel;

/**
 *
 * @author HP
 */
public class ControladorTablero implements ActionListener {

    Tablero tablero;
    Configuracion configuracion;
    TableroPanel tableroPanel;
    TableroData tableroData;
    ControladorPanelTablero controladorPanelTablero;

    public ControladorTablero(int numeroPuntos, List<Jugador> jugadores) {
        this.tablero = new Tablero();
        this.configuracion = new Configuracion();
        this.tableroPanel = new TableroPanel();
        tableroPanel.setSize(900, 700);
        this.tableroData = new TableroData(numeroPuntos,
                tableroPanel.getWidth(), tableroPanel.getHeight());
        tableroData.setJugadores(jugadores);
        this.controladorPanelTablero = new ControladorPanelTablero(tablero,
                tableroPanel, tableroData);
        this.generarEventosConfiguracion();
    }

    private void generarEventosConfiguracion() {
        this.tablero.btnConfiguracion.addActionListener(this);

    }

    public void iniciar() {
        List<Punto> puntos = tableroData.getPuntos();
        tableroPanel.generarPuntos(puntos);
        tablero.cargarTablero(tableroPanel);
        ingresarJugadores();
        tablero.setVisible(true);
    }

    private void ingresarJugadores() {
        tablero.nombreJ1.setText(tableroData.getJugadores().get(0).getNombre());
        tablero.nombreJ2.setText(tableroData.getJugadores().get(1).getNombre());
        tablero.nombreJ3.setText(tableroData.getJugadores().get(2).getNombre());
        tablero.nombreJ4.setText(tableroData.getJugadores().get(3).getNombre());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source instanceof JButton) {
            JButton buttonClicked = (JButton) source;
            if (buttonClicked.equals(tablero.btnConfiguracion)) {
                configuracion.setVisible(true);
            }
        }

    }

}
