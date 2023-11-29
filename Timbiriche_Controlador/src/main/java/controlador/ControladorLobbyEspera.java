
package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.TableroData;
import dominio.Jugador;
import vista.LobbyEspera;


/**
 *
 * @author Jorge
 */
public class ControladorLobbyEspera implements ActionListener{
    TableroData tableroData;
    LobbyEspera lobbyEspera;
    ControladorTablero controladorTablero;
    ControladorPantallaInicio controladorPantallaInicio;
//    Jugador jugador;

    public ControladorLobbyEspera() {
        this.tableroData = tableroData;
        this.lobbyEspera = lobbyEspera;
        this.lobbyEspera.btnConfirmar.addActionListener(this);
        this.lobbyEspera.btnSalir.addActionListener(this);
    }
    
    public void iniciarPantalla(){
        this.lobbyEspera.setVisible(true);
    }
    
//    public void nuevoJugador(Jugador jugador) {
//        if (tableroData.getJugadores() == null || tableroData.getJugadores().size() < 3) {
//            tableroData.agregarJugador(jugador);
//            lobbyEspera.nombreJ4.setText(this.lider.getNombre());
//            //SE MUESTRA LA PANTALLA DEL LOBBY.
//            //--------------------------------------------------------------------
//            /* Se obtiene la posicion en la lista del jugador para poder asignarle
//            un espacio en la pantalla. */
//            int posicionLista = tableroData.getJugadores().indexOf(jugador) + 1;
//            switch (posicionLista) {
//                case 1:
//                    partidaNueva.nombreJ1.setText(jugador.getNombre());
//                    //SE REGISTRA LA IMAGEN DE PERFIL
//                    break;
//                case 2:
//                    partidaNueva.nombreJ2.setText(jugador.getNombre());
//                    //SE REGISTRA LA IMAGEN DE PERFIL
//                    break;
//                case 3:
//                    partidaNueva.nombreJ3.setText(jugador.getNombre());
//                    //SE REGISTRA LA IMAGEN DE PERFIL
//                    break;
//            }
//
//        } else {
//            //Se muestra un cuadro de dialogo al jugador que solicita entrar 
//            //indicando que la partida esta llena.
////            JOptionPane.showMessageDialog(null);
//        }
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lobbyEspera.btnConfirmar) {
            //ESTO SE SOLUCIONA CON EVENTOS
            controladorTablero = new ControladorTablero(0, tableroData);
            controladorTablero.iniciar();
            lobbyEspera.dispose();
        } if (e.getSource() == lobbyEspera.btnSalir) {
            controladorPantallaInicio = new ControladorPantallaInicio(tableroData);
            controladorPantallaInicio.iniciarPantalla();
            lobbyEspera.dispose();
        }
    }
}