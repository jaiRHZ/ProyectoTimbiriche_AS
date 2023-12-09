/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import dominio.Cuadrado;
import dominio.Linea;
import dominio.Punto;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;

/**
 *
 * @author HP
 */
public class GestorTableroPanel {

    public void dibujarPuntos(Graphics g, List<Punto> puntos,
            Punto puntoA, Punto puntoB) {
        for (int i = 0; i < puntos.size(); i++) {
            g.setColor(Color.WHITE);
            int posicionX = puntos.get(i).getX();
            int posicionY = puntos.get(i).getY();
            if (puntoA != null
                    && puntoA.equals(puntos.get(i))
                    || puntoB != null
                    && puntoB.equals(puntos.get(i))) {
                g.setColor(Color.GREEN);
            }
            g.fillOval(posicionX, posicionY, 10, 10);
        }
    }

    public void dibujarLineas(Graphics g, List<Linea> lineas) {
        if (lineas != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(5));
            for (int i = 0; i < lineas.size(); i++) {
                g.setColor(lineas.get(i).getColor());
                Punto a = lineas.get(i).getPuntoA();
                Punto b = lineas.get(i).getPuntoB();
                g.drawLine(a.getX() + 10 / 2,
                        a.getY() + 10 / 2,
                        b.getX() + 10 / 2,
                        b.getY() + 10 / 2);
            }
        }
    }

    public void dibujarCuadrados(Graphics g, List<Cuadrado> cuadrados, int lado) {
        if (cuadrados != null) {
            for (int i = 0; i < cuadrados.size(); i++) {
                g.setColor(cuadrados.get(i).getColor());
                g.fillRect(cuadrados.get(i).getPuntoA().getX(),
                        cuadrados.get(i).getPuntoA().getY(),
                        lado + 10, lado + 10);
            }
        }
    }
}
