/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class TableroData {

    private List<Punto> puntos;
    private List<Jugador> jugadores;
    private List<Linea> lineas;
    private Double distanciaPuntos;

    public TableroData(int cantidadPuntos, int anchoTablero, int altoTablero) {
        this.puntos = calcularPuntosTablero(cantidadPuntos, anchoTablero, altoTablero);
        this.lineas = new ArrayList<>();
        this.calcularDistancia();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Punto> puntos) {
        this.puntos = puntos;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }

    public Double getDistanciaPuntos() {
        return distanciaPuntos;
    }

    public void setDistanciaPuntos(Double distanciaPuntos) {
        this.distanciaPuntos = distanciaPuntos;
    }

    private List<Punto> calcularPuntosTablero(int cantidadPuntos, int anchoTablero, int altoTablero) {
        List<Punto> puntos = new ArrayList<>();
        int espacioAltura = altoTablero / cantidadPuntos;
        int espacioAncho = anchoTablero / cantidadPuntos;

        for (int i = (espacioAltura / 2); i <= altoTablero - (espacioAltura / 2); i += espacioAltura) {
            for (int j = (espacioAncho / 2); j <= anchoTablero - (espacioAncho / 2); j += espacioAncho) {
                puntos.add(new Punto(j, i));
            }

        }
        return puntos;
    }

    public Punto validarPunto(Punto puntoValidar) {
        for (Punto punto : getPuntos()) {
            if (puntoValidar.getX() >= punto.getX() - 10 && puntoValidar.getX() <= punto.getX() + 10
                    && puntoValidar.getY() >= punto.getY() - 10 && puntoValidar.getY() <= punto.getY() + 10) {
                return punto;
            }
        }
        return null;
    }

    private void calcularDistancia() {
        Punto puntoA = this.puntos.get(0);
        Punto puntoB = this.puntos.get(1);;
        Double distanciaX = Math.pow((puntoB.getX() - puntoA.getX()), 2);
        Double distanciaY = Math.pow((puntoB.getY() - puntoA.getY()), 2);
        this.distanciaPuntos = Math.sqrt(distanciaX + distanciaY);
    }

    public boolean validarLinea(Linea linea) {
        Punto puntoA = linea.getPuntoA();
        Punto puntoB = linea.getPuntoB();
        Double distanciaX = Math.pow((puntoB.getX() - puntoA.getX()), 2);
        Double distanciaY = Math.pow((puntoB.getY() - puntoA.getY()), 2);
        Double distancia = Math.sqrt(distanciaX + distanciaY);
        if (distancia.equals(distanciaPuntos)) {
            return true;
        } else {
            return false;
        }
    }

}
