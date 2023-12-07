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

        if (tableroData.getJugadores().isEmpty()) {

        } else {
            if (tableroData.getJugadores().size() == 1) {
                partidaNueva.imgJugador1.setIcon(tableroData.getJugadores().get(0).getIcono());
                partidaNueva.nombreJ1.setText(tableroData.getJugadores().get(0).getNombre());
            }
            if (tableroData.getJugadores().size() == 2) {
                partidaNueva.imgJugador2.setIcon(tableroData.getJugadores().get(1).getIcono());
                partidaNueva.nombreJ2.setText(tableroData.getJugadores().get(1).getNombre());
            }
            if (tableroData.getJugadores().size() == 3) {
                partidaNueva.imgJugador3.setIcon(tableroData.getJugadores().get(2).getIcono());
                partidaNueva.nombreJ3.setText(tableroData.getJugadores().get(2).getNombre());
            }
            if (tableroData.getJugadores().size() == 4) {
                partidaNueva.imgJugador4.setIcon(tableroData.getJugadores().get(3).getIcono());
                partidaNueva.nombreJ4.setText(tableroData.getJugadores().get(3).getNombre());
            }

        }

    }

}
