package com.telusko.main;

import com.telusko.services.GreetMe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        GreetMe g=con.getBean(GreetMe.class);
        System.out.println(g.generateGreeting());

    }
}
