package com.example.mqpublisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAmqpTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend() {
        String queueName = "simple.queue";
        String message = "hello,mq";
        for (int i = 0; i < 100; i++) {
            rabbitTemplate.convertAndSend(queueName, message + i);
        }
    }

    @Test
    public void testSendExchange() {
        String exchangeName = "fanout";
        String message = "hello ex";
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend(exchangeName, "", message);
        }
    }
}
