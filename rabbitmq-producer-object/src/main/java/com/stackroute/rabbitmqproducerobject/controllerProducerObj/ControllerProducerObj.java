package com.stackroute.rabbitmqproducerobject.controllerProducerObj;

import com.stackroute.rabbitmqproducerobject.domainProducer.Employee;
import com.stackroute.rabbitmqproducerobject.serviceProducerObj.ServiceProducerObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "stackroute")
public class ControllerProducerObj {
    @Autowired
    ServiceProducerObj serviceProducerObj;


    @GetMapping(value = "/producer")
  public String producer(@RequestParam ("email")String email,@RequestParam ("empName") String empName) {
        Employee emp=new Employee();
        emp.setEmail(email);
        emp.setEmpName(empName);
        serviceProducerObj.send(emp);
       return "Object sent";

    }
}