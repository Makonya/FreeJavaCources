package com.java;

public class AudiA80 extends Car{

    public AudiA80(String color) {
        super(color);
    }

//    @Override  аннотация - переопределить
    public void run() {
        System.out.println("Audi is running");
    }
}
