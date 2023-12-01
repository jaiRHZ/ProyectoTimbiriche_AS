/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

import dominio.Jugador;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jorge
 */
public class ApPartidaNueva {
    
    TableroData tableroData;
    
    public ApPartidaNueva(TableroData tableroData) {
        this.tableroData = tableroData;
    }
    
    /*Metodo que crea un codigo unico para identificar la partida. */
    public String generarCodigo() {
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int longitudCodigo = 4;
        SecureRandom random = new SecureRandom();

        StringBuilder codigoBuilder = new StringBuilder();
        for (int i = 0; i < longitudCodigo; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            codigoBuilder.append(caracterAleatorio);
        }

        return codigoBuilder.toString();
    }
    
    
}
