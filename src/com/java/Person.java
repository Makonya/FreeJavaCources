package com.java;

public class Person {
    /**
     * Поля
     */
    double weight;
    double height;
    String name;
    String secondName;

    /**
     * Alt+Insert - генерация кода
     * */

    /**
     * Конструкторы - отвечают за создание объекта
     */
    public Person() {
        this.name = "Undifined";
        this.secondName = "Undifined";
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public Person(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    /**
     * Методы - действия, поведение
     */
    public boolean talk(){
        boolean flag = false;
        if (weight != 0.0 && height != 0.0){
            flag = true;
            System.out.println(name + ": aaaaaaaaaaaaa");
        } else {
            System.out.println("Set weight and height");
        }
        return flag;
    }

    public void walk(){
        if (name != null){
            System.out.println(name + ": I'm walking");
        } else {
            System.out.println("Set the name before walking");
        }
    }
}
