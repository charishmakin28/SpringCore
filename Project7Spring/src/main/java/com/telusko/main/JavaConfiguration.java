package com.telusko.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
@ComponentScan(basePackages = {"com.telusko"})
public class JavaConfiguration {
    public JavaConfiguration() {
        System.out.println("JavaConfiguration Bean is created");
    }

    @Bean
    public LocalTime createTime(){
        return LocalTime.now();
    }
}
