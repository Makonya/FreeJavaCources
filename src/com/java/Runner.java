package com.java;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("Stas");

        System.out.println("First person");
        System.out.println(person.name);

        System.out.println("Second person");
        System.out.println(person2.height);

        person.walk();

        while (!person2.talk()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter double value");
            double value = Double.parseDouble(scanner.nextLine());
            person2.height = value;
            person2.weight = value;
        }
    }
}
