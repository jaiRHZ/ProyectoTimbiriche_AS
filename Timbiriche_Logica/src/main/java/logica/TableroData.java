/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

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

    public TableroData() {
        evento.iniciarJugador();
    }

    public void addLinea(Linea linea) {
        this.lineas.add(linea);
        System.out.println(linea.toString());
        evento.enviarEvento(new EventosTimbiriche("linea", linea));
    }

}
