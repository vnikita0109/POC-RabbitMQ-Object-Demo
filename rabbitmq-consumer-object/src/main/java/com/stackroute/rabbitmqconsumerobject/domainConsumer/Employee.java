package com.stackroute.rabbitmqconsumerobject.domainConsumer;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Employee.class)
public class Employee {
    private String empName;
    private String email;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String empId) {
        this.email = empId;
    }

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empId=" + email + "]";
    }
}


