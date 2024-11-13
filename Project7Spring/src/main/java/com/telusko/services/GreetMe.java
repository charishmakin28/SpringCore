package com.telusko.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetMe {

    @Autowired
    private LocalTime time;

    public GreetMe() {
        System.out.println("Greetme bean created");
    }

    public String generateGreeting(){

        //LocalTime time =  LocalTime.now();
        int hour =time.getHour();
        if(hour<12){
            return "Good Morning";
        } else if (hour<16) {
           return "Good Afternoon";
        } else if (hour<20) {
            return "Good evening";
        } else{
            return "Good night";
        }

    }

}
