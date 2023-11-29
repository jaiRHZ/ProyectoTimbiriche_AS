/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Daniel Alameda
 */
public class Consumidor {

    public static void main(String[] args) {
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();

            // Declarar el intercambio de tipo "fanout"
            channel.exchangeDeclare("miIntercambioFanout", "fanout");

            // Crear una cola temporal y enlazarla al intercambio
            String nombreCola = channel.queueDeclare().getQueue();
            channel.queueBind(nombreCola, "miIntercambioFanout", "");

            // Configurar el consumidor para recibir mensajes desde la cola
            channel.basicConsume(nombreCola, true, (consumerTag, delivery) -> {
                String mensaje = new String(delivery.getBody(), StandardCharsets.UTF_8);
                System.out.println("Mensaje recibido: " + mensaje);
            }, consumerTag -> {
            });

            System.out.println("Esperando mensajes...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
