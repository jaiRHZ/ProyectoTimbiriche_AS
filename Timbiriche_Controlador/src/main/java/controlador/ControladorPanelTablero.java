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
import modelo.Linea;
import modelo.Punto;
import modelo.TableroData;
import vista.Tablero;
import vista.TableroPanel;

/**
 *
 * @author HP
 */
public class ControladorPanelTablero implements MouseListener {

    Punto punto1 = null;
    Punto punto2 = null;
    Linea linea = null;
    TableroPanel tableroPanel;
    Tablero tablero;
    TableroData tableroData;

    public ControladorPanelTablero(Tablero tablero, TableroPanel tableroPanel, TableroData tableroData) {
        this.tableroPanel = tableroPanel;
        this.tablero = tablero;
        this.tableroData = tableroData;
        this.generarEventosConfiguracion();
    }

    private void generarEventosConfiguracion() {
        tablero.panelPrincipal.addMouseListener(this);

    }

    public Punto seleccionarPunto(MouseEvent me) {
        for (Punto punto : tableroData.getPuntos()) {
            if (me.getX() >= punto.getX() - 10 && me.getX() <= punto.getX() + 10
                    && me.getY() >= punto.getY() - 10 && me.getY() <= punto.getY() + 10) {
                return punto;
            }
        }
        return null;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        switch (me.getButton()) {
            case MouseEvent.BUTTON1:
                if (punto1 == null) {
                    this.punto1 = seleccionarPunto(me);
                    tableroPanel.puntoA = punto1;
                } else if (punto2 == null) {
                    this.punto2 = seleccionarPunto(me);
                    tableroPanel.puntoB = punto2;
                    linea = new Linea(punto1, punto2);
                    if (linea != null) {
                        tableroPanel.generaLineas(linea);
                        punto1 = null;
                        punto2 = null;
                        tableroPanel.puntoA = punto1;
                        tableroPanel.puntoB = punto2;
                    }
                }
                break;
            case MouseEvent.BUTTON3:
                punto1 = null;
                punto2 = null;
                tableroPanel.puntoA = punto1;
                tableroPanel.puntoB = punto2;
                break;
            default:
                break;
        }
        tableroPanel.repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        this.tableroPanel.setBorder(BorderFactory.createLineBorder(Color.yellow, 3));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        this.tableroPanel.setBorder(null);
    }

}
