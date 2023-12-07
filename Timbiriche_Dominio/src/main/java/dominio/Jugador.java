/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import com.google.gson.annotations.SerializedName;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Jugador {

    @SerializedName("nombre")
    String nombre;
    @SerializedName("path")
    String path;
    @SerializedName("color")
    Color color;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre, String path) {
        this.nombre = nombre;
        this.path = path;
    }

    public Jugador(String nombre, String path, Color color) {
        this.nombre = nombre;
        this.path = path;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Icon getIcono() {
        try {
            URL imageUrl = getClass().getClassLoader().getResource(this.path);
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.path);
        hash = 67 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", path=" + path + ", color=" + color + '}';
    }

}
