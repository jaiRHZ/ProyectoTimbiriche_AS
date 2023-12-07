/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dominio.Jugador;
import dominio.Linea;
import intermedario.EventosTimbiriche;
import intermedario.ProcesarEvento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Alameda
 */
public class TableroData {

    List<Linea> lineas = new ArrayList<>();
    ProcesarEvento evento = new ProcesarEvento(this);
    List<Jugador> jugadores = new ArrayList<>();

    public TableroData() {
        evento.iniciarJugador();
    }

    public void addLinea(Linea linea) {
        this.lineas.add(linea);
        evento.enviarEvento(new EventosTimbiriche("linea", linea));
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

}
