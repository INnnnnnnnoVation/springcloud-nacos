package com.example.mqconsumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {
    @RabbitListener(queues = "fanout.queue1")
    public void listener1(String msg){
        System.out.println("listener1 receive msg:"+msg);
    }

    @RabbitListener(queues = "fanout.queue2")
    public void listener2(String msg){
        System.out.println("listener2 receive msg:"+msg);
    }
}
