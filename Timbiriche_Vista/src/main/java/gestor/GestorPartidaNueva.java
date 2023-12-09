/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import aplicacion.TableroData;
import dominio.Jugador;
import java.util.List;
import vista.PartidaNueva;

/**
 *
 * @author HP
 */
public class GestorPartidaNueva {

    public void cargarJugadores(PartidaNueva partidaNueva, TableroData tableroData) {
        try {
            List<Jugador> jugadores = tableroData.getJugadores();

            if (jugadores != null && !jugadores.isEmpty()) {
                if (jugadores.size() >= 1) {
                    partidaNueva.imgJugador1.setIcon(jugadores.get(0).getIcono());
                    partidaNueva.nombreJ1.setText(jugadores.get(0).getNombre());

                }
                if (jugadores.size() >= 2) {
                    partidaNueva.imgJugador2.setIcon(jugadores.get(1).getIcono());
                    partidaNueva.nombreJ2.setText(jugadores.get(1).getNombre());
                }
                if (jugadores.size() >= 3) {
                    partidaNueva.imgJugador3.setIcon(jugadores.get(2).getIcono());
                    partidaNueva.nombreJ3.setText(jugadores.get(2).getNombre());
                }
                if (jugadores.size() >= 4) {
                    partidaNueva.imgJugador4.setIcon(jugadores.get(3).getIcono());
                    partidaNueva.nombreJ4.setText(jugadores.get(3).getNombre());
                }
            }

        } catch (Exception e) {
        }
    }

}
