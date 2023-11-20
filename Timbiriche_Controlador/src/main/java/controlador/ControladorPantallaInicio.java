package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.TableroData;
import vista.PantallaInicio;

/**
 *
 * @author HP
 */
public class ControladorPantallaInicio implements ActionListener {

    private TableroData tableroData;
    private PantallaInicio pantallaInicio;

    public ControladorPantallaInicio(TableroData tableroData) {
        this.tableroData = tableroData;
        this.pantallaInicio = new PantallaInicio();
    }

    public void iniciarPantalla() {
        this.pantallaInicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
