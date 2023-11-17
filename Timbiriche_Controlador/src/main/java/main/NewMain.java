/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.ControladorTablero;
import java.util.ArrayList;
import java.util.List;
import dominio.Jugador;

/**
 *
 * @author HP
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Daniel"));
        jugadores.add(new Jugador("Jairo"));
        jugadores.add(new Jugador("Herman"));
        jugadores.add(new Jugador("Jorge"));

        ControladorTablero controladorTablero = new ControladorTablero(10, jugadores);

        controladorTablero.iniciar();

    }

}
