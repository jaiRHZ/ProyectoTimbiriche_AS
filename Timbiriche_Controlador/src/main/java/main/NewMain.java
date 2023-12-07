/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.ControladorPartidaNueva;
import controlador.ControladorTablero;
import java.util.ArrayList;
import java.util.List;
import dominio.Jugador;
import controlador.ControladorRegistro;
import aplicacion.TableroData;
import controlador.ControladorUnirsePartida;

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
//        List<Jugador> jugadores = new ArrayList<>();
//        jugadores.add(new Jugador("Daniel"));
//        jugadores.add(new Jugador("Jairo"));
//        jugadores.add(new Jugador("Herman"));
//        jugadores.add(new Jugador("Jorge"));

//        ControladorTablero controladorTablero = new ControladorTablero(10, jugadores);
//        controladorTablero.iniciar();
//        TableroData tableroData = new TableroData();
//        tableroData.setJugadorPrincipal(new Jugador("Jorge"));
//        ControladorPartidaNueva cpn = new ControladorPartidaNueva(tableroData);
//        cpn.nuevoJugador(new Jugador("Jorge"));
//        cpn.nuevoJugador(new Jugador("Daniel"));
//        cpn.nuevoJugador(new Jugador("Fernando"));
//        cpn.nuevoJugador(new Jugador("Luis"));
//        cpn.nuevoJugador(new Jugador("Fernando"));
//        cpn.iniciarPantalla();
//        
//        ControladorUnirsePartida controlUnirsePartida = new ControladorUnirsePartida(tableroData);
//        controlUnirsePartida.unirsePartida(new Jugador("Jorge"));
        ControladorRegistro cr = new ControladorRegistro();
        cr.iniciarPantalla();

//        ApPartidaNueva appPN = new ApPartidaNueva(tableroData);
//        appPN.nuevoJugador(new Jugador("Jorge"));
//        appPN.nuevoJugador(new Jugador("Daniel"));
//        appPN.nuevoJugador(new Jugador("Fernando"));
//        appPN.nuevoJugador(new Jugador("Luis"));
//        cpn.iniciarPantalla();
    }

}
