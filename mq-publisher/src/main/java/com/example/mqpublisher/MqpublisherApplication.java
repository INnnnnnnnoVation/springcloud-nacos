package com.example.mqpublisher;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class MqpublisherApplication {

    public static void main(String[] args) throws IOException, TimeoutException {
        SpringApplication.run(MqpublisherApplication.class, args);
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.setHost("43.138.130.26");
//        connectionFactory.setPort(5672);
//        connectionFactory.setUsername("root");
//        connectionFactory.setPassword("123456");
//
//        Connection connection = connectionFactory.newConnection();
//        Channel channel = connection.createChannel();
//        String queueName = "simple.queue";
//        channel.queueDeclare(queueName,false,false,false,null);
//        String message = "hello mq";
//        channel.basicPublish("",queueName,null,message.getBytes());
//        channel.close();
    }

}
