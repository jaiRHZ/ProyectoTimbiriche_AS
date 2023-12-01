package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import aplicacion.TableroData;
import vista.PantallaInicio;

/**
 *
 * @author HP
 */
public class ControladorPantallaInicio implements ActionListener {

    private TableroData tableroData;
    private PantallaInicio pantallaInicio;
    private ControladorPartidaNueva controladorPartidaNueva;

    public ControladorPantallaInicio(TableroData tableroData) {
        this.tableroData = tableroData;
        // Verifica si tableroData y el líder no son nulos antes de intentar acceder al nombre
        if (tableroData != null && tableroData.getJugadorPrincipal() != null) {
            System.out.println(tableroData.getJugadorPrincipal().getNombre());
        } else {
            // Maneja el caso en que tableroData o el líder es null
            System.out.println("TableroData o el líder es null");
        };
        this.pantallaInicio = new PantallaInicio();

        this.pantallaInicio.btnPartidaNueva.addActionListener(this);
        this.pantallaInicio.btnUnirse.addActionListener(this);
    }

    public void iniciarPantalla() {
        this.controladorPartidaNueva = new ControladorPartidaNueva(tableroData);
        this.pantallaInicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.pantallaInicio.btnPartidaNueva) {
            this.pantallaInicio.dispose();
            controladorPartidaNueva.iniciarPantalla();
        }
    }

}
