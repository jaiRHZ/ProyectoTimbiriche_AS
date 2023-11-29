/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import dominio.Jugador;
import dominio.Punto;
import test.TableroData;
//import aplicacion.TableroData;
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

    public ControladorTablero(int numeroPuntos,
            TableroData tableroData) {
        this.tablero = new Tablero(tableroData);
        this.tableroPanel = new TableroPanel();
        tableroPanel.setSize(600, 600);
        this.tableroData = tableroData;
        this.tableroData.iniciarTablero(numeroPuntos,
                tableroPanel.getWidth(), tableroPanel.getHeight());
        tableroData.setJugadores(tableroData.getJugadores());
        this.tableroPanel.cargarInformacion(tableroData);
        this.configuracion = new Configuracion();

        tableroData.agregarObservador(tableroPanel);

        this.controladorPanelTablero = new ControladorPanelTablero(tablero,
                tableroPanel, tableroData);
        this.generarEventosConfiguracion();

    }

    private void generarEventosConfiguracion() {
        this.tablero.btnConfiguracion.addActionListener(this);

    }

    public void iniciar() {
        List<Punto> puntos = tableroData.getPuntos();
        tablero.cargarTablero(tableroPanel);
//        ingresarJugadores();
        tablero.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source instanceof JButton) {
            JButton buttonClicked = (JButton) source;
            String comando = ae.getActionCommand();

            if (comando.equals("configuracion")) {
                this.configuracion.setVisible(true);
            }
        }

    }

}
