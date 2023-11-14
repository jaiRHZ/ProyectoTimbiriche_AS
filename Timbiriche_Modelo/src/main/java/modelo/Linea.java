/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public class Linea {

    private Punto puntoA;
    private Punto puntoB;

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

}
