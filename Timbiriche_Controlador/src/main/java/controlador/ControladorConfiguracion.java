package controlador;

//import com.sun.media.sound.EmergencySoundbank;
import dominio.Jugador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import aplicacion.TableroData;
import vista.Configuracion;
import vista.Tablero;

/**
 *
 * @author Hermann
 */
public class ControladorConfiguracion implements ActionListener {

    Configuracion configuracion;
    Tablero tablero;
    Jugador jugador;
    TableroData tableroData;
    private String colorSeleccionado;

    public ControladorConfiguracion() {
        this.tablero = new Tablero();
        this.configuracion = new Configuracion();
        this.cargarIcons();
        this.generarEventos();

    }

    public void iniciar() {
        configuracion.setVisible(true);
//         List<Jugador> listaDeJugadores = tableroData.getJugadores();
//        Jugador jugadorActual = listaDeJugadores.get(0);
//        configuracion.imgJugador1.setText(jugadorActual.getIcono());
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
            setColorJugador(color, 0);
        }
        if (e.getSource() == configuracion.comBoxColores1) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores1));
            setColorJugador(color, 1);
        }
        if (e.getSource() == configuracion.comBoxColores2) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores2));
            setColorJugador(color, 2);
        }
        if (e.getSource() == configuracion.comBoxColores3) {
            Color color = Color.decode(extraerColor(configuracion.comBoxColores3));
            setColorJugador(color, 3);
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
        return colorJava;
    }

    public void setColorJugador(Color color, int jugador) {
        List<Jugador> listaDeJugadores = tableroData.getJugadores();
        Jugador jugadorActual = listaDeJugadores.get(jugador);
        jugadorActual.setColor(color);
    }

    public void cargarIcons() {
        List<Jugador> listaDeJugadores = tableroData.getJugadores();
        for (int i = 0; i < 3; i++) {
            Jugador jugadorActual = listaDeJugadores.get(i);
            if (jugadorActual != null) {
                switch (i) {
                    case 0:
                        configuracion.imgJugador1.setIcon(jugadorActual.getIcono());
                        break;
                    case 1:
                        configuracion.imgJugador2.setIcon(jugadorActual.getIcono());
                        break;
                    case 2:
                        configuracion.imgJugador3.setIcon(jugadorActual.getIcono());
                        break;
                    case 3:
                        configuracion.imgJugador4.setIcon(jugadorActual.getIcono());
                        break;
                }
            }
        }
    }
}
