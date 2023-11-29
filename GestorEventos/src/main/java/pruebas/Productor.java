/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 *
 * @author Daniel Alameda
 */
public class Productor {

    public static void main(String[] args) {
        try {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            Connection connection = connectionFactory.newConnection();
            Channel channel = connection.createChannel();

            // Declarar el intercambio de tipo "fanout"
            channel.exchangeDeclare("miIntercambioFanout", "fanout");

            // Mensaje a enviar
            
            String mensaje = "Hola, este es un mensaje para todos los consumidores";

            // Publicar el mensaje en el intercambio
            channel.basicPublish("miIntercambioFanout", "", null, mensaje.getBytes());

            System.out.println("Mensaje enviado: " + mensaje);

            // Cerrar conexiones
            channel.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
