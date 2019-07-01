package com.stackroute.rabbitmqproducerobject.serviceProducerObj;

import com.stackroute.rabbitmqproducerobject.domainProducer.Employee;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceProducerObj {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${stackroute.rabbitmq.exchange}")
    private String exchange;

    @Value("${stackroute.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Employee emp) {
        rabbitTemplate.convertAndSend(exchange, routingkey, emp);
        System.out.println("Send msg = " + emp.toString());

    }
}

