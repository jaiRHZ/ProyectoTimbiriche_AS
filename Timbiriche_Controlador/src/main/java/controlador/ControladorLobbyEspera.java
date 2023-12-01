
package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import aplicacion.TableroData;
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