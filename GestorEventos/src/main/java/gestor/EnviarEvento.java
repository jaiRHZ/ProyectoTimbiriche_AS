/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Daniel Alameda
 */
public class EnviarEvento {

    private static final String EXCHANGE_NAME = "mensajes-videojuego";
    private static final String RABBITMQ_HOST = "187.188.79.83"; // Cambia esto

    public void enviarEvento(String evento) throws IOException, TimeoutException {
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

            // Mensaje a enviar
            // Publicar el mensaje en el intercambio
            channel.basicPublish(EXCHANGE_NAME, "", null, evento.getBytes());

            // Cerrar conexiones
            channel.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
