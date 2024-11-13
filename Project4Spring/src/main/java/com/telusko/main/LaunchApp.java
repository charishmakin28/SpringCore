package com.telusko.main;

import com.telusko.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
        //ApplicationContext container2 = new ClassPathXmlApplicationContext("ApplicationConfig2.xml");
//        Employee emp =container.getBean(Employee.class);
//        System.out.println(emp);
//        System.out.println(emp.taskEmployee());
        Employee emp =container.getBean("emp3",Employee.class);
        System.out.println(emp);
        System.out.println(emp.taskEmployee());

    }
}
