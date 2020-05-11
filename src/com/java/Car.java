package com.java;

public abstract class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public void stop(){
        System.out.println("Stop");
    }

    public String getColor(){
        return color;
    }
}
