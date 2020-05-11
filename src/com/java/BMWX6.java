package com.java;

public class BMWX6 extends Car implements Runnable, Useble {
    private double weight;

    public BMWX6(String color) {
        super(color);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void stop() {
        System.out.println("BMW stop");
    }

    @Override
    public void run() {
        System.out.println("Interface BMW run");
    }

    public static void doSmt(){
        System.out.println("I'm static");
    }

    @Override
    public void use() {
        System.out.println("Using");
    }
}
