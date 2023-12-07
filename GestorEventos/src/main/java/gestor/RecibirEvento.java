/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import observador.IObservableEvento;
import observador.IObservadorEvento;

/**
 *
 * @author Daniel Alameda
 */
public class RecibirEvento implements IObservableEvento {

    private List<IObservadorEvento> observadores = new ArrayList<>();
    private static final String EXCHANGE_NAME = "mensajes-videojuego";
    private static final String RABBITMQ_HOST = "187.188.79.83"; // Cambia esto

    public void recibirEvento() throws IOException, TimeoutException {
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            connectionFactory.setHost("192.168.100.11"); // Reemplaza con la dirección IP del servidor RabbitMQ
            connectionFactory.setUsername("guest");
            connectionFactory.setPassword("guest");
            connectionFactory.setVirtualHost("/");

            Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();

            // Declarar el intercambio de tipo "fanout"
            channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

            // Crear una cola temporal y enlazarla al intercambio
            String nombreCola = channel.queueDeclare().getQueue();
            channel.queueBind(nombreCola, EXCHANGE_NAME, "");

            // Configurar el consumidor para recibir mensajes desde la cola
            channel.basicConsume(nombreCola, true, (consumerTag, delivery) -> {
                String mensaje = new String(delivery.getBody(), StandardCharsets.UTF_8);
                actualizarTodos(mensaje);

            }, consumerTag -> {
            });

            System.out.println("Esperando mensajes...");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actualizarTodos(String evento
    ) {
        for (IObservadorEvento observador : observadores) {
            observador.nuevoMensajeRecibido(evento);
        }
    }

    @Override
    public void agregarObservador(IObservadorEvento observador
    ) {
        this.observadores.add(observador);
    }

    @Override
    public void eliminarObservador(IObservadorEvento observador
    ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
