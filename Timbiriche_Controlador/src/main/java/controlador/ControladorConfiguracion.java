package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import vista.Configuracion;
import vista.Tablero;

/**
 *
 * @author Hermann
 */
public class ControladorConfiguracion implements ActionListener {

    Configuracion configuracion;
    Tablero tablero;

    public ControladorConfiguracion() {
        this.tablero = new Tablero();
        this.configuracion = new Configuracion();
        this.generarEventos();

    }

    public void iniciar() {
        configuracion.setVisible(true);
    }

    public void generarEventos() {
        this.configuracion.btnAceptar.addActionListener(this);
        this.configuracion.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton buttonClicked = (JButton) source;
            if (buttonClicked.equals(configuracion.btnCancelar)) {
                tablero.setVisible(true);
            }
            if (buttonClicked.equals(configuracion.btnAceptar)) {
                tablero.setVisible(true);
            }
        }
    }

}
