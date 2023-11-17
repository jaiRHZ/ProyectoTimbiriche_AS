package controlador;

import dominio.Jugador;
import vista.PantallaInicio;

/**
 *
 * @author HP
 */
public class ControladorPantallaInicio {

    private Jugador jugador;
    private PantallaInicio pantallaInicio;

    public ControladorPantallaInicio(Jugador jugador) {
        this.jugador = jugador;
        iniciarPantalla();
    }

    public void iniciarPantalla() {
        this.pantallaInicio = new PantallaInicio();
        this.pantallaInicio.setVisible(true);
    }

}
