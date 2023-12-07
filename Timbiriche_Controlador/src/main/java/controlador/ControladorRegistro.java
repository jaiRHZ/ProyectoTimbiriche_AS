package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import dominio.Jugador;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import vista.Registro;
import aplicacion.TableroData;

/**
 *
 * @author Julio Mejía Sotomayor | 229021
 */
public class ControladorRegistro implements ActionListener {

    private final Registro registro;
    private final TableroData tableroData;
    private ControladorPantallaInicio controladorPantallaInicio;
    private int contador = 0;
    private Icon icon;
    private String colorSeleccionado;
    private Color color;
    private String direccionImg;

    public ControladorRegistro() {
        this.tableroData = new TableroData();
        this.registro = new Registro();
        this.registro.btnRegistrar.addActionListener(this);
        this.registro.btnSiguiente.addActionListener(this);
        this.registro.btnAnterior.addActionListener(this);
        this.registro.comBoxColores.addActionListener(this);
        this.icon = cargarImagen("images/0.jpg");
        //new ImageIcon(getClass().getClassLoader().getResource("images/0.jpg"));
        registro.imgAvatar.setIcon(icon);

    }

    public void iniciarPantalla() {

        this.registro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registro.btnRegistrar) {
            String nickname = registro.txtNickname.getText();
            if (nickname.equals("Crea tu Nickname")) {
                JOptionPane.showMessageDialog(null, "El nickname del jugador está vacío");
            } else if (color == null) {
                JOptionPane.showMessageDialog(null, "El color del jugador está vacío");
            } else {
                this.tableroData.setJugadorPrincipal(new Jugador(nickname, direccionImg, color));
                controladorPantallaInicio = new ControladorPantallaInicio(tableroData);
                controladorPantallaInicio.iniciarPantalla();
                registro.dispose();
            }
        }
        if (e.getSource() == registro.btnSiguiente) {
            if (contador >= 5) {
                contador = 0;
            } else {
                contador++;
            }
        }
        if (e.getSource() == registro.btnAnterior) {
            if (contador <= 0) {
                contador = 5;
            } else {
                contador--;
            }

        }

//        //COLORES
        if (e.getSource() == registro.comBoxColores) {
            try {
                color = Color.decode(extraerColor(registro.comBoxColores));
            } catch (NumberFormatException ex) {
                color = null;
                System.out.println(ex.getMessage());
            }

        }
        direccionImg = "images/" + contador + ".jpg";
        icon = cargarImagen(direccionImg);
        //new ImageIcon(getClass().getClassLoader().getResource("images/" + contador + ".jpg"));
        registro.imgAvatar.setIcon(icon);

    }

    private Icon cargarImagen(String path) {
        try {
            URL imageUrl = getClass().getClassLoader().getResource(path);
            Image originalImage = ImageIO.read(imageUrl);

            int newWidth = 100;
            int newHeight = 100;

            Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

            return new ImageIcon(resizedImage);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la imagen: " + e.getMessage());
            return null;
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
}
