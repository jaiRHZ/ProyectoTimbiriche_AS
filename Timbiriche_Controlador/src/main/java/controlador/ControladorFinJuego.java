package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.TableroData;
import vista.FinJuego;
import dominio.Jugador;

/**
 *
 * @author HP
 */
public class ControladorFinJuego implements ActionListener{
    
    private FinJuego finJuego;
    private TableroData tableroData;
    private ControladorPantallaInicio controladorPantallaInicio;
    private ControladorPartidaNueva controladorPartidaNueva;
    
    public ControladorFinJuego(){
        this.tableroData = tableroData;
        this.finJuego = finJuego;
        this.finJuego.btnMenuPrincipal.addActionListener(this);
        this.finJuego.btnNuevoJuego.addActionListener(this);
        finJuego.imgGanador.setIcon(tableroData.getJugadorPrincipal().getIcono());
    }
    
    public void iniciarPantalla(){
        this.finJuego.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == finJuego.btnMenuPrincipal) {
            controladorPantallaInicio = new ControladorPantallaInicio(tableroData);
            controladorPantallaInicio.iniciarPantalla();
            finJuego.dispose();
        } if (e.getSource() == finJuego.btnNuevoJuego) {
            controladorPartidaNueva = new ControladorPartidaNueva();
            controladorPartidaNueva.iniciarPantalla();
            finJuego.dispose();
        }
    }
    
    
    
    
}
