package com.java;

/**
 * Абстрактный класс: нельзя создать объект абстрактного класса
 * */
public abstract class Animal {
    protected double weight;
    double height;

    public Animal() {
        System.out.println("Constructor Animal");
    }

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void walk(){
        System.out.println("I'm walking");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
