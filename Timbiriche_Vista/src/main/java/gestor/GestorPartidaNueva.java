/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import aplicacion.TableroData;
import vista.PartidaNueva;

/**
 *
 * @author HP
 */
public class GestorPartidaNueva {

    public void cargarJugadores(PartidaNueva partidaNueva, TableroData tableroData) {
        partidaNueva.imgJugador1.setIcon(tableroData.getJugadorPrincipal().getIcono());
        partidaNueva.nombreJ1.setName(tableroData.getJugadorPrincipal().getNombre());
        if (tableroData.getJugadores().isEmpty()) {

        } else {
            if (tableroData.getJugadores().get(0) != null) {
                partidaNueva.imgJugador2.setIcon(tableroData.getJugadores().get(0).getIcono());
                partidaNueva.nombreJ2.setName(tableroData.getJugadores().get(0).getNombre());
            }
            if (tableroData.getJugadores().get(1) != null) {
                partidaNueva.imgJugador3.setIcon(tableroData.getJugadores().get(1).getIcono());
                partidaNueva.nombreJ3.setName(tableroData.getJugadores().get(1).getNombre());
            }
            if (tableroData.getJugadores().get(2) != null) {
                partidaNueva.imgJugador4.setIcon(tableroData.getJugadores().get(2).getIcono());
                partidaNueva.nombreJ4.setName(tableroData.getJugadores().get(2).getNombre());
            }
        }

    }

}
