/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author HP
 */
public class ConfiguracionTablero {

    int cantidadPuntos;
    int anchoTablero;
    int altoTablero;

    public ConfiguracionTablero() {
    }

    public ConfiguracionTablero(int cantidadPuntos, int anchoTablero, int altoTablero) {
        this.cantidadPuntos = cantidadPuntos;
        this.anchoTablero = anchoTablero;
        this.altoTablero = altoTablero;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public int getAnchoTablero() {
        return anchoTablero;
    }

    public void setAnchoTablero(int anchoTablero) {
        this.anchoTablero = anchoTablero;
    }

    public int getAltoTablero() {
        return altoTablero;
    }

    public void setAltoTablero(int altoTablero) {
        this.altoTablero = altoTablero;
    }

}
