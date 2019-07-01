package com.stackroute.rabbitmqconsumerobject.serviceConsumerObj;

import com.stackroute.rabbitmqconsumerobject.domainConsumer.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ServiceConsumerObj {

    @RabbitListener(queues="${stackroute.rabbitmq.queue}")
    public  void recievedMessage(Employee message){
        System.out.println("Recieved message from RabbitMQ : "+message.toString());
    }

}
