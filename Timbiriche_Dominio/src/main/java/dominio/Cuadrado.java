/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author HP
 */
public class Cuadrado {

    private Punto puntoA;
    private Punto puntoB;
    private Punto puntoC;
    private Punto puntoD;
    private Color color;

    public Cuadrado() {
    }

    public Cuadrado(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD, Color color) {
        List<Punto> puntos = new ArrayList<>();
        puntos.add(puntoA);
        puntos.add(puntoB);
        puntos.add(puntoC);
        puntos.add(puntoD);

        // Utiliza el comparador para ordenar los puntos
        Collections.sort(puntos, Comparator.comparingInt(Punto::valorComparable));

        // Imprime los puntos ordenados
        this.puntoA = puntos.get(0);
        this.puntoB = puntos.get(1);
        this.puntoC = puntos.get(2);
        this.puntoD = puntos.get(3);

        this.color = color;

    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public Punto getPuntoC() {
        return puntoC;
    }

    public Punto getPuntoD() {
        return puntoD;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
