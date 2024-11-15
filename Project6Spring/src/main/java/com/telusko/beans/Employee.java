package com.telusko.beans;

import org.springframework.stereotype.Component;


public class Employee {
    private  Integer id;
    private String name;
    private Double salary;
    private Department depart;

    public Employee(){
        super();
        System.out.println("Employee Bean is created");
    }

    public Employee(Integer id, String name, Double salary, Department depart) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.depart = depart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Department getDepart() {
        return depart;
    }

    public void setDepart(Department depart) {
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", depart=" + depart +
                '}';
    }
}
