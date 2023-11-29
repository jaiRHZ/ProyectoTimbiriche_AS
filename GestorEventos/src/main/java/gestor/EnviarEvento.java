/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Daniel Alameda
 */
public class EnviarEvento {

    private static final String EXCHANGE_NAME = "fanout-exchange";

    public void enviarEvento(String evento) throws IOException, TimeoutException {
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();

            // Declarar el intercambio de tipo "fanout"
            channel.exchangeDeclare("miIntercambioFanout", "fanout");

            // Mensaje a enviar
            // Publicar el mensaje en el intercambio
            channel.basicPublish("miIntercambioFanout", "", null, evento.getBytes());

            // Cerrar conexiones
            channel.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public void enviarEvento(String evento) throws IOException, TimeoutException {
//
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        try (Connection connection = connectionFactory.newConnection()) {
//
//            String nombreUsuario = "daniel";
//
//            // Crear una cola única para cada consumidor basada en el nombre del usuario
//            String queueName = "cola-" + nombreUsuario;
//
//            try (Channel channel = connection.createChannel()) {
//                channel.queueDeclare(queueName, false, false, false, null);
//
//                DeliverCallback deliverCallback = (consumerTag, delivery) -> {
//                    String mensaje = new String(delivery.getBody(), StandardCharsets.UTF_8);
//                    System.out.println(mensaje);
//                };
//
//                channel.basicConsume(queueName, true, deliverCallback, consumerTag -> {
//                });
//
//            }
//        }
//
//    }
}
