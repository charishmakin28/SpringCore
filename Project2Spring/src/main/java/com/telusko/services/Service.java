package com.telusko.services;

import org.springframework.stereotype.Component;

@Component("ser")
public class Service {
    public Service() {
        System.out.println("Service Bean created");
    }
    public void create(){
        System.out.println("Create method in service class");
    }
}
