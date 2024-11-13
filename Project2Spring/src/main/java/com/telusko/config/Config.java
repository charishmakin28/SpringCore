package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Config {
    public Config(){
        System.out.println("Config Bean created");
    }

    @Bean
    public Password passwordContext(){
        Password ps  = new Password("cherry");
        return ps;
    }

    @Bean
    public ArrayList create(){
        return new ArrayList();
    }
}
