///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package aplicacion;
//
//import dominio.Jugador;
//import dominio.Linea;
//import dominio.Punto;
//import intermedario.ProcesarEvento;
//import java.util.ArrayList;
//import java.util.List;
//import observador.IObservable;
//import observador.IObservador;
//
///**
// *
// * @author HP
// */
//public class TableroData implements IObservable {
//
//    private List<IObservador> observadoresPantalla;
//    private List<Punto> puntos;
//    private List<Jugador> jugadores;
//    private List<Linea> lineas;
//    private Double distanciaPuntos;
//    private Punto puntoA;
//    private Punto puntoB;
//
//    public TableroData(int cantidadPuntos, int anchoTablero, int altoTablero) {
//        this.puntos = calcularPuntosTablero(cantidadPuntos, anchoTablero, altoTablero);
//        this.lineas = new ArrayList<>();
//        this.observadoresPantalla = new ArrayList<>();
//        this.calcularDistancia();
//
//    }
//
//    public List<Jugador> getJugadores() {
//        return jugadores;
//    }
//
//    public void setJugadores(List<Jugador> jugadores) {
//        this.jugadores = jugadores;
//    }
//
//    public List<Punto> getPuntos() {
//        return puntos;
//    }
//
//    public void setPuntos(List<Punto> puntos) {
//        this.puntos = puntos;
//    }
//
//    public List<Linea> getLineas() {
//        return lineas;
//    }
//
//    public void setLineas(List<Linea> lineas) {
//        this.lineas = lineas;
//    }
//
//    public Double getDistanciaPuntos() {
//        return distanciaPuntos;
//    }
//
//    public void setDistanciaPuntos(Double distanciaPuntos) {
//        this.distanciaPuntos = distanciaPuntos;
//    }
//
//    public Punto getPuntoA() {
//        return puntoA;
//    }
//
//    public Punto getPuntoB() {
//        return puntoB;
//    }
//
//    public void vaciarPuntos() {
//        this.puntoA = null;
//        this.puntoB = null;
//        actualizarTodos();
//    }
//
//    private List<Punto> calcularPuntosTablero(int cantidadPuntos, int anchoTablero, int altoTablero) {
//        List<Punto> puntos = new ArrayList<>();
//        int espacioAltura = altoTablero / cantidadPuntos;
//        int espacioAncho = anchoTablero / cantidadPuntos;
//
//        for (int i = (espacioAltura / 2); i <= altoTablero - (espacioAltura / 2); i += espacioAltura) {
//            for (int j = (espacioAncho / 2); j <= anchoTablero - (espacioAncho / 2); j += espacioAncho) {
//                puntos.add(new Punto(j, i));
//            }
//
//        }
//        return puntos;
//    }
//
//    public boolean validarPunto(Punto puntoValidar) {
//        for (Punto punto : getPuntos()) {
//            if (puntoValidar.getX() >= punto.getX() - 10
//                    && puntoValidar.getX() <= punto.getX() + 10
//                    && puntoValidar.getY() >= punto.getY() - 10
//                    && puntoValidar.getY() <= punto.getY() + 10) {
//                if (puntoA == null) {
//                    puntoA = punto;
//                    actualizarTodos();
//                } else if (puntoB == null) {
//
//                    puntoB = punto;
//
//                    validarLinea();
//                    vaciarPuntos();
//                }
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    private void calcularDistancia() {
//        Punto puntoA = this.puntos.get(0);
//        Punto puntoB = this.puntos.get(1);;
//        Double distanciaX = Math.pow((puntoB.getX() - puntoA.getX()), 2);
//        Double distanciaY = Math.pow((puntoB.getY() - puntoA.getY()), 2);
//        this.distanciaPuntos = Math.sqrt(distanciaX + distanciaY);
//    }
//
//    private boolean validarLinea() {
//        Punto puntoA = this.puntoA;
//        Punto puntoB = this.puntoB;
//
//        Double distanciaX = Math.pow((puntoB.getX() - puntoA.getX()), 2);
//        Double distanciaY = Math.pow((puntoB.getY() - puntoA.getY()), 2);
//        Double distancia = Math.sqrt(distanciaX + distanciaY);
//        if (distancia.equals(distanciaPuntos)) {
//            Linea linea = new Linea(puntoA, puntoB);
//            this.lineas.add(linea);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public void actualizarTodos() {
//        for (IObservador observadores : observadoresPantalla) {
//            observadores.actualizar();
//        }
//    }
//
//    @Override
//    public void agregarObservador(IObservador observador) {
//        this.observadoresPantalla.add(observador);
//    }
//
//    @Override
//    public void eliminarObservador(IObservador observador) {
//        this.observadoresPantalla.remove(observador);
//    }
//}
