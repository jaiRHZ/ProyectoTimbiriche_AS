package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import vista.Configuracion;
import vista.Tablero;

/**
 *
 * @author Hermann
 */
public class ControladorConfiguracion implements ActionListener {

    Configuracion configuracion;
    Tablero tablero;
    private String colorSeleccionado;

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

        this.configuracion.comBoxColores.addActionListener(this);
        this.configuracion.comBoxColores1.addActionListener(this);
        this.configuracion.comBoxColores2.addActionListener(this);
        this.configuracion.comBoxColores3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //BOTONES ACTION
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

        //COMBOBOX ACTION
        if (e.getSource() == configuracion.comBoxColores) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores));
        }
        if (e.getSource() == configuracion.comBoxColores1) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores1));
        }
        if (e.getSource() == configuracion.comBoxColores2) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores2));
        }
        if (e.getSource() == configuracion.comBoxColores3) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores3));
        }
    }

    private String extraerColor(JComboBox<String> comboBox) {
        colorSeleccionado = (String) comboBox.getSelectedItem();
        String colorJava = "";
        switch (colorSeleccionado.toLowerCase()) {
            case "negro":
                colorJava = "#000000";
                break;
            case "blanco":
                colorJava = "#FFFFFF";
                break;
            case "rojo":
                colorJava = "#FF0000";
                break;
            case "verde":
                colorJava = "#00FF00";
                break;
            case "azul":
                colorJava = "#0000FF";
                break;
            case "amarillo":
                colorJava = "#FFFF00";
                break;
            case "cian":
                colorJava = "#00FFFF";
                break;
            case "morado":
                colorJava = "#800080";
                break;
            case "gris claro":
                colorJava = "#CCCCCC";
                break;
            case "gris oscuro":
                colorJava = "#666666";
                break;
        }
        System.out.println(colorSeleccionado);
        return colorJava;
    }
}
