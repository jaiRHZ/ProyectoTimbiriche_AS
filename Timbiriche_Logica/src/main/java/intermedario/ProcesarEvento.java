/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intermedario;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dominio.Linea;
import gestor.EnviarEvento;
import gestor.RecibirEvento;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import observador.IObservable;
import observador.IObservador;
import observador.IObservadorEvento;
import logica.TableroData;

/**
 *
 * @author Daniel Alameda
 */
public class ProcesarEvento implements IObservadorEvento {

    private EnviarEvento enviarEvento;
    private RecibirEvento recibirEvento;
    private Gson gson;
    private TableroData tableroData;

    public ProcesarEvento(TableroData tableroData) {
        this.enviarEvento = new EnviarEvento();
        this.gson = new GsonBuilder().create();
        this.recibirEvento = new RecibirEvento();

        this.tableroData = tableroData;
        recibirEvento.agregarObservador(this);
    }

    public void enviarEvento(EventosTimbiriche eventosTimbiriche) {

        try {
            String jsonEvento = gson.toJson(eventosTimbiriche);
            enviarEvento.enviarEvento(jsonEvento);
        } catch (IOException ex) {
            Logger.getLogger(ProcesarEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(ProcesarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void iniciarJugador() {
        try {

            recibirEvento.recibirEvento();

        } catch (IOException ex) {
            Logger.getLogger(ProcesarEvento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(ProcesarEvento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override

    public void nuevoMensajeRecibido(String mensaje) {

        System.out.println("..........");
        EventosTimbiriche evt = gson.fromJson(mensaje, EventosTimbiriche.class);
        if (evt.getDistinatario().equals("logica")) {
            System.out.println(evt.toString());
            if (evt.getTipo().equals("linea")) {

                Linea linea = gson.fromJson(gson.toJsonTree(evt.getObject()), Linea.class);
                System.out.println(linea.toString());
                tableroData.addLinea(linea);

            }

        }

    }

}
