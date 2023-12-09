/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import com.google.gson.annotations.SerializedName;
import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class Linea {

    @SerializedName("puntoA")
    private Punto puntoA;
    @SerializedName("puntoB")
    private Punto puntoB;
    @SerializedName("color")
    private Color color;

    public Linea() {
    }

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean puntosConectados(Linea otraLinea) {
        return this.puntoA.equals(otraLinea.puntoA) || this.puntoA.equals(otraLinea.puntoB)
                || this.puntoB.equals(otraLinea.puntoA) || this.puntoB.equals(otraLinea.puntoB);
    }

    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.puntoA);
        hash = 19 * hash + Objects.hashCode(this.puntoB);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Linea other = (Linea) obj;
        if (!Objects.equals(this.puntoA, other.puntoA)) {
            return false;
        }
        if (!Objects.equals(this.puntoB, other.puntoB)) {
            return false;
        }
        return true;
    }

}
