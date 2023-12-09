/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dominio.ConfiguracionTablero;
import dominio.Cuadrado;
import dominio.Jugador;
import dominio.Linea;
import dominio.Punto;
import intermedario.EventosTimbiriche;
import intermedario.ProcesarEvento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Alameda
 */
public class TableroData {

    List<Linea> lineas = new ArrayList<>();
    List<Cuadrado> cuadrados = new ArrayList<>();
    ProcesarEvento evento = new ProcesarEvento(this);
    List<Jugador> jugadores = new ArrayList<>();
    Double distanciaPuntos;

    public double getDistanciaPuntos() {
        return distanciaPuntos;
    }

    public void setDistanciaPuntos(double distanciaPuntos) {
        this.distanciaPuntos = distanciaPuntos;
    }

    public TableroData() {
        evento.iniciarJugador();
    }

    public void addLinea(Linea linea) {
        if (!validarLineaExistente(linea)) {
            validarCuadrado(linea);
            this.lineas.add(linea);
            evento.enviarEvento(new EventosTimbiriche("linea", linea));

        }

    }

    public void addCuadrado(Cuadrado cuadrado) {
        this.cuadrados.add(cuadrado);
        evento.enviarEvento(new EventosTimbiriche("cuadrado", cuadrado));
    }

    public void validarCuadrado(Linea linea) {
        Punto puntoCSup;
        Punto puntoDSup;
        Punto puntoCInf;
        Punto puntoDInf;
        Linea lineaSup = null;
        Linea lineaInf;
        Linea lineaADSuperiorPositivo;
        Linea lineaADSuperiorNegativo;
        Linea lineaBCInferiorPositivo;
        Linea lineaBCInferiorNegativo;

        Punto puntoBSup;
        Punto puntoBInf;
        Linea lineaABSuperiorPositivo;
        Linea lineaABSuperiorNegativo;
        Linea lineaDCSuperiorPositivo;
        Linea lineaDCSuperiorNegativo;

        if (linea.getPuntoA().getX() == linea.getPuntoB().getX()) {

            puntoDSup = new Punto((int) (linea.getPuntoA().getX() + distanciaPuntos),
                    linea.getPuntoA().getY());
            puntoDInf = new Punto((int) (linea.getPuntoA().getX() - distanciaPuntos),
                    linea.getPuntoA().getY());
            puntoCSup = new Punto((int) (linea.getPuntoB().getX() + distanciaPuntos),
                    linea.getPuntoB().getY());
            puntoCInf = new Punto((int) (linea.getPuntoB().getX() - distanciaPuntos),
                    linea.getPuntoB().getY());
            lineaSup = new Linea(puntoDSup, puntoCSup);
            lineaADSuperiorPositivo = new Linea(linea.getPuntoA(), lineaSup.getPuntoA());
            lineaBCInferiorPositivo = new Linea(linea.getPuntoB(), lineaSup.getPuntoB());
            lineaInf = new Linea(puntoDInf, puntoCInf);
            lineaADSuperiorNegativo = new Linea(lineaInf.getPuntoA(), linea.getPuntoA());
            lineaBCInferiorNegativo = new Linea(lineaInf.getPuntoB(), linea.getPuntoB());

            if (validarLineaExistente(lineaSup)
                    && validarLineaExistente(lineaADSuperiorPositivo)
                    && validarLineaExistente(lineaBCInferiorPositivo)) {

                System.out.println("Cuadrado");
                Cuadrado cuadrado = new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoDSup, puntoCSup, linea.getColor());
                addCuadrado(cuadrado);

            }
            if (validarLineaExistente(lineaInf)
                    && validarLineaExistente(lineaADSuperiorNegativo)
                    && validarLineaExistente(lineaBCInferiorNegativo)) {

                System.out.println("Cuadrado");
                Cuadrado cuadrado = new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoDInf, puntoCInf, linea.getColor());
                addCuadrado(cuadrado);

            }

        } else if (linea.getPuntoA().getY() == linea.getPuntoB().getY()) {
            puntoBSup = new Punto(linea.getPuntoA().getX(),
                    (int) (linea.getPuntoA().getY() + distanciaPuntos));
            puntoBInf = new Punto(linea.getPuntoA().getX(),
                    (int) (linea.getPuntoA().getY() - distanciaPuntos));
            puntoCSup = new Punto(linea.getPuntoB().getX(),
                    (int) (linea.getPuntoB().getY() + distanciaPuntos));
            puntoCInf = new Punto(linea.getPuntoB().getX(),
                    (int) (linea.getPuntoB().getY() - distanciaPuntos));
            lineaSup = new Linea(puntoBSup, puntoCSup);
            lineaInf = new Linea(puntoBInf, puntoCInf);
            lineaABSuperiorPositivo = new Linea(linea.getPuntoA(), lineaSup.getPuntoA());
            lineaABSuperiorNegativo = new Linea(lineaInf.getPuntoA(), linea.getPuntoA());
            lineaDCSuperiorPositivo = new Linea(linea.getPuntoB(), lineaSup.getPuntoB());
            lineaDCSuperiorNegativo = new Linea(lineaInf.getPuntoB(), linea.getPuntoB());

            if (validarLineaExistente(lineaSup)
                    && validarLineaExistente(lineaABSuperiorPositivo)
                    && validarLineaExistente(lineaDCSuperiorPositivo)) {

                System.out.println("Cuadrado");
                Cuadrado cuadrado = new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoBSup, puntoCSup, linea.getColor());
                addCuadrado(cuadrado);

            }
            if (validarLineaExistente(lineaInf)
                    && validarLineaExistente(lineaABSuperiorNegativo)
                    && validarLineaExistente(lineaDCSuperiorNegativo)) {

                System.out.println("Cuadrado");
                Cuadrado cuadrado = new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoBInf, puntoCInf, linea.getColor());
                addCuadrado(cuadrado);
            }

        }

    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
        for (int i = 0; i < jugadores.size(); i++) {
            evento.enviarEvento(new EventosTimbiriche(
                    "nuevoJugador", jugadores.get(i)));
        }

    }

    public boolean validarLineaExistente(Linea linea) {
        for (int i = 0; i < this.lineas.size(); i++) {
            if (lineas.get(i).equals(linea)) {
                return true;
            }
        }
        return false;
    }

}
