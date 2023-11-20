/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import javax.swing.Icon;

/**
 *
 * @author HP
 */
public class Jugador {

    String nombre;
    Icon icono;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre, Icon icono) {
        this.nombre = nombre;
        this.icono = icono;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

}
