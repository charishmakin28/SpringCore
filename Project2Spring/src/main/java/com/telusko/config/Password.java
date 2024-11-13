package com.telusko.config;


public class Password {
    public Password(String s){
        System.out.println("Password bean created and managed by spring");
    }

    public void generatePass(){
        System.out.println("Method in Password class");
    }
}
