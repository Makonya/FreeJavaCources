package com.java;

public class Person extends Animal {
    private String name;
    private String secondName;

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Person(double weight, double height, String name, String secondName) {
        super(weight, height);
        this.name = name;
        this.secondName = secondName;
    }

    public String getName(){
        return name;
    }

    public String getSecondName(){
        return secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "This is the person, his name is " + name + " " + secondName;
    }
}
