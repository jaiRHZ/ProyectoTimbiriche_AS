package controlador;

import dominio.Jugador;
import test.TableroData;
import vista.PantallaInicio;

/**
 *
 * @author HP
 */
public class ControladorPantallaInicio {

    private TableroData tableroData;
    private PantallaInicio pantallaInicio;

    public ControladorPantallaInicio(TableroData tableroData) {
        this.tableroData = tableroData;
        this.pantallaInicio = new PantallaInicio();
    }

    public void iniciarPantalla() {
        this.pantallaInicio.setVisible(true);
    }

}
