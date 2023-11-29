/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import dominio.Cuadrado;
import dominio.Jugador;
import dominio.Linea;
import dominio.Punto;
import gestor.RecibirEvento;
import intermedario.EventosTimbiriche;
import intermedario.ProcesarEvento;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import observador.IObservable;
import observador.IObservador;

/**
 *
 * @author HP
 */
public class TableroData implements IObservable {

    private List<IObservador> observadoresPantalla;
    private List<Punto> puntos;
    private Jugador jugadorPrincipal;
    private static List<Jugador> jugadores;
    private List<Linea> lineas;
    private List<Cuadrado> cuadrados;
    private Double distanciaPuntos;
    private Punto puntoA;
    private Punto puntoB;
    private ProcesarEvento procesarEvento;
//    private RecibirEvento recibirEvento = new RecibirEvento();
    private String codigoPartida;

    public TableroData() {
        this.observadoresPantalla = new ArrayList<>();
        this.jugadores = new ArrayList<>();

    }

//    public TableroData(int cantidadPuntos, int anchoTablero, int altoTablero) {
//        this.puntos = calcularPuntosTablero(cantidadPuntos, anchoTablero, altoTablero);
//        this.lineas = new ArrayList<>();
//        this.cuadrados = new ArrayList<>();
//        this.observadoresPantalla = new ArrayList<>();
//        this.calcularDistancia();$
//
//    }
    public void iniciarTablero(int cantidadPuntos, int anchoTablero, int altoTablero) {
        this.puntos = calcularPuntosTablero(cantidadPuntos, anchoTablero, altoTablero);
        this.lineas = new ArrayList<>();
        this.cuadrados = new ArrayList<>();
        this.observadoresPantalla = new ArrayList<>();
        this.calcularDistancia();
        this.procesarEvento = new ProcesarEvento(this);
        procesarEvento.iniciarJugador();
    }

    public List<IObservador> getObservadoresPantalla() {
        return observadoresPantalla;
    }

    public void setObservadoresPantalla(List<IObservador> observadoresPantalla) {
        this.observadoresPantalla = observadoresPantalla;
    }

    public Jugador getJugadorPrincipal() {
        return jugadorPrincipal;
    }

    public void setJugadorPrincipal(Jugador jugadorPrincipal) {
        this.jugadorPrincipal = jugadorPrincipal;
        this.actualizarTodos();
    }

    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
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

    public String getCodigoPartida() {
        return codigoPartida;
    }

    public void setCodigoPartida(String codigoPartida) {
        this.codigoPartida = codigoPartida;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }

    public void addLinea(Linea linea) {
        this.lineas.add(linea);
        System.out.println(linea.toString());
        actualizarTodos();
    }

    public Double getDistanciaPuntos() {
        return distanciaPuntos;
    }

    public void setDistanciaPuntos(Double distanciaPuntos) {
        this.distanciaPuntos = distanciaPuntos;
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public List<Cuadrado> getCuadrados() {
        return cuadrados;
    }

    public void setCuadrados(List<Cuadrado> cuadrados) {
        this.cuadrados = cuadrados;
    }

    public void vaciarPuntos() {
        this.puntoA = null;
        this.puntoB = null;
        actualizarTodos();
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

    public boolean validarPunto(Punto puntoValidar) {
        for (Punto punto : getPuntos()) {
            if (puntoValidar.getX() >= punto.getX() - 10
                    && puntoValidar.getX() <= punto.getX() + 10
                    && puntoValidar.getY() >= punto.getY() - 10
                    && puntoValidar.getY() <= punto.getY() + 10) {
                if (puntoA == null) {
                    puntoA = punto;
                    actualizarTodos();
                } else if (puntoB == null) {

                    puntoB = punto;

                    validarLinea();
                    vaciarPuntos();
                }
                return true;
            }
        }

        return false;
    }

    private void calcularDistancia() {
        Punto puntoA = this.puntos.get(0);
        Punto puntoB = this.puntos.get(1);;
        Double distanciaX = Math.pow((puntoB.getX() - puntoA.getX()), 2);
        Double distanciaY = Math.pow((puntoB.getY() - puntoA.getY()), 2);
        this.distanciaPuntos = Math.sqrt(distanciaX + distanciaY);
    }

    private boolean validarLinea() {
        Punto puntoA = this.puntoA;
        Punto puntoB = this.puntoB;

        Double distanciaX = Math.pow((puntoB.getX() - puntoA.getX()), 2);
        Double distanciaY = Math.pow((puntoB.getY() - puntoA.getY()), 2);
        Double distancia = Math.sqrt(distanciaX + distanciaY);
        if (distancia.equals(distanciaPuntos)) {

            Linea linea = acomodarCordenadas(new Linea(puntoA, puntoB));

            this.validarCuadrado(linea);
            this.lineas.add(linea);
            this.procesarEvento.enviarEvento(new EventosTimbiriche("linea", linea));
            return true;
        } else {
            return false;
        }
    }

    private Linea acomodarCordenadas(Linea linea) {
        int valorA = linea.getPuntoA().getX() + linea.getPuntoA().getY();
        int valorB = linea.getPuntoB().getX() + linea.getPuntoB().getY();
        if (valorA < valorB) {
            return new Linea(puntoA, puntoB);
        } else {
            return new Linea(puntoB, puntoA);
        }
    }

//    public void validarCuadrado(Linea linea) {
//        Punto puntoCSup;
//        Punto puntoDSup;
//        Punto puntoCInf;
//        Punto puntoDInf;
//        Linea lineaSup = null;
//        Linea lineaInf;
//        Linea lineaADSuperiorPositivo;
//        Linea lineaADSuperiorNegativo;
//        Linea lineaBCInferiorPositivo;
//        Linea lineaBCInferiorNegativo;
//
//        Punto puntoBSup;
//        Punto puntoBInf;
//        Linea lineaABSuperiorPositivo;
//        Linea lineaABSuperiorNegativo;
//        Linea lineaDCSuperiorPositivo;
//        Linea lineaDCSuperiorNegativo;
//
//        if (linea.getPuntoA().getX() == linea.getPuntoB().getX()) {
//
//            puntoDSup = new Punto((int) (linea.getPuntoA().getX() + distanciaPuntos),
//                    linea.getPuntoA().getY());
//            puntoDInf = new Punto((int) (linea.getPuntoA().getX() - distanciaPuntos),
//                    linea.getPuntoA().getY());
//            puntoCSup = new Punto((int) (linea.getPuntoB().getX() + distanciaPuntos),
//                    linea.getPuntoB().getY());
//            puntoCInf = new Punto((int) (linea.getPuntoB().getX() - distanciaPuntos),
//                    linea.getPuntoB().getY());
//            lineaSup = new Linea(puntoDSup, puntoCSup);
//            lineaADSuperiorPositivo = new Linea(linea.getPuntoA(), lineaSup.getPuntoA());
//            lineaBCInferiorPositivo = new Linea(linea.getPuntoB(), lineaSup.getPuntoB());
//            lineaInf = new Linea(puntoDInf, puntoCInf);
//            lineaADSuperiorNegativo = new Linea(lineaInf.getPuntoA(), linea.getPuntoA());
//            lineaBCInferiorNegativo = new Linea(lineaInf.getPuntoB(), linea.getPuntoB());
//
//            if (validarLineaExistente(lineaSup)
//                    && validarLineaExistente(lineaADSuperiorPositivo)
//                    && validarLineaExistente(lineaBCInferiorPositivo)) {
//                JOptionPane.showMessageDialog(null, "Cuadrado");
//                System.out.println("Cuadrado");
//                cuadrados.add(new Cuadrado(linea, lineaSup,
//                        lineaADSuperiorPositivo, lineaBCInferiorPositivo));
//
//            }
//            if (validarLineaExistente(lineaInf)
//                    && validarLineaExistente(lineaADSuperiorNegativo)
//                    && validarLineaExistente(lineaBCInferiorNegativo)) {
//                JOptionPane.showMessageDialog(null, "Cuadrado");
//                System.out.println("Cuadrado");
//                cuadrados.add(new Cuadrado(linea, lineaInf,
//                        lineaADSuperiorNegativo, lineaBCInferiorNegativo));
//            }
//
//        } else if (linea.getPuntoA().getY() == linea.getPuntoB().getY()) {
//            puntoBSup = new Punto(linea.getPuntoA().getX(),
//                    (int) (linea.getPuntoA().getY() + distanciaPuntos));
//            puntoBInf = new Punto(linea.getPuntoA().getX(),
//                    (int) (linea.getPuntoA().getY() - distanciaPuntos));
//            puntoCSup = new Punto(linea.getPuntoB().getX(),
//                    (int) (linea.getPuntoB().getY() + distanciaPuntos));
//            puntoCInf = new Punto(linea.getPuntoB().getX(),
//                    (int) (linea.getPuntoB().getY() - distanciaPuntos));
//            lineaSup = new Linea(puntoBSup, puntoCSup);
//            lineaInf = new Linea(puntoBInf, puntoCInf);
//            lineaABSuperiorPositivo = new Linea(linea.getPuntoA(), lineaSup.getPuntoA());
//            lineaABSuperiorNegativo = new Linea(lineaInf.getPuntoA(), linea.getPuntoA());
//            lineaDCSuperiorPositivo = new Linea(linea.getPuntoB(), lineaSup.getPuntoB());
//            lineaDCSuperiorNegativo = new Linea(lineaInf.getPuntoB(), linea.getPuntoB());
//
//            if (validarLineaExistente(lineaSup)
//                    && validarLineaExistente(lineaABSuperiorPositivo)
//                    && validarLineaExistente(lineaDCSuperiorPositivo)) {
//                JOptionPane.showMessageDialog(null, "Cuadrado");
//                System.out.println("Cuadrado");
//                cuadrados.add(new Cuadrado(linea, lineaSup,
//                        lineaABSuperiorPositivo, lineaDCSuperiorPositivo));
//
//            }
//            if (validarLineaExistente(lineaInf)
//                    && validarLineaExistente(lineaABSuperiorNegativo)
//                    && validarLineaExistente(lineaDCSuperiorNegativo)) {
//                JOptionPane.showMessageDialog(null, "Cuadrado");
//                System.out.println("Cuadrado");
//                cuadrados.add(new Cuadrado(linea, lineaInf,
//                        lineaABSuperiorNegativo, lineaDCSuperiorNegativo));
//            }
//
//        }
//
//    }
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
                JOptionPane.showMessageDialog(null, "Cuadrado");
                System.out.println("Cuadrado");
                cuadrados.add(new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoDSup, puntoCSup));

            }
            if (validarLineaExistente(lineaInf)
                    && validarLineaExistente(lineaADSuperiorNegativo)
                    && validarLineaExistente(lineaBCInferiorNegativo)) {
                JOptionPane.showMessageDialog(null, "Cuadrado");
                System.out.println("Cuadrado");
                cuadrados.add(new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoDInf, puntoCInf));
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
                JOptionPane.showMessageDialog(null, "Cuadrado");
                System.out.println("Cuadrado");
                cuadrados.add(new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoBSup, puntoCSup));

            }
            if (validarLineaExistente(lineaInf)
                    && validarLineaExistente(lineaABSuperiorNegativo)
                    && validarLineaExistente(lineaDCSuperiorNegativo)) {
                JOptionPane.showMessageDialog(null, "Cuadrado");
                System.out.println("Cuadrado");
                cuadrados.add(new Cuadrado(linea.getPuntoA(), linea.getPuntoB(),
                        puntoBInf, puntoCInf));
            }

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

    @Override
    public void actualizarTodos() {
        for (IObservador observadores : observadoresPantalla) {
            observadores.actualizar();
        }
    }

    @Override
    public void agregarObservador(IObservador observador) {
        this.observadoresPantalla.add(observador);
    }

    @Override
    public void eliminarObservador(IObservador observador) {
        this.observadoresPantalla.remove(observador);
    }
}
