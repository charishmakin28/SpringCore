package com.telusko.beans;

import org.springframework.stereotype.Component;


public class Employee {
    private  Integer id;
    private String name;
    private Double salary;
    private  String addr;

    public Employee(){
        super();
        System.out.println("Employee Bean is created");
    }

    public Employee(Integer id, String name, Double salary, String addr) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addr = addr;
        System.out.println("Employee bean is created using param constructor");
    }
    public String taskEmployee(){
        return "Every Employee acts productive but in reality all of them are less productive";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", namee='" + name + '\'' +
                ", salary=" + salary +
                ", addr='" + addr + '\'' +
                '}';
    }
}
