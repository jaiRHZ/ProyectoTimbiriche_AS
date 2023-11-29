/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import dominio.Punto;
import aplicacion.TableroData;
//import aplicacion.TableroData;
import vista.Tablero;
import vista.TableroPanel;

/**
 *
 * @author HP
 */
public class ControladorPanelTablero implements MouseListener {

//    TableroPanel tableroPanel;
    Tablero tablero;
    TableroData tableroData;

    public ControladorPanelTablero(Tablero tablero, TableroPanel tableroPanel, TableroData tableroData) {
//        this.tableroPanel = tableroPanel;
        this.tablero = tablero;
        this.tableroData = tableroData;

        this.generarEventosConfiguracion();
    }

    private void generarEventosConfiguracion() {
        tablero.panelPrincipal.addMouseListener(this);

    }

    public boolean seleccionarPunto(MouseEvent me) {
        Punto punto = new Punto(me.getX(), me.getY());
        boolean respuesta = tableroData.validarPunto(punto);
        return respuesta;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        switch (me.getButton()) {
            case MouseEvent.BUTTON1:
                seleccionarPunto(me);
                break;
            case MouseEvent.BUTTON3:
                tableroData.vaciarPuntos();
                break;

        }
    }

    @Override
    public void mousePressed(MouseEvent me
    ) {

    }

    @Override
    public void mouseReleased(MouseEvent me
    ) {
    }

    @Override
    public void mouseEntered(MouseEvent me
    ) {
//        this.tableroPanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
        this.tablero.panelPrincipal.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
    }

    @Override
    public void mouseExited(MouseEvent me
    ) {
//        this.tableroPanel.setBorder(null);
    }

}
