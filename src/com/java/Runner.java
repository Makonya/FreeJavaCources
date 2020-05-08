package com.java;

public class Runner {
    public static void main(String[] args) {
        /**
         * 3 основные парадигмы ООП(3 кита ООП):
         * - Наследование
         * - Инкапсуляция
         * - Полиморфизм
         * */

        Person person = new Person("Ivan", "Ivanov");
        person.weight = 40.5;
        person.height = 150.5;
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getSecondName());
        person.setSecondName("Petrov");
        System.out.println(person.getSecondName());
        person.walk();

        Mammal mammal = new Mammal();
        mammal.height = 50;
        mammal.type = "wild";
        System.out.println(mammal);

        /**
         * Модификаторы доступа
         * - public - доступен во всей программе
         * - protected - доступен наследникам
         * - default - доступен в рамках пакета
         * - private - доступен в рамках класса
         * */
    }
}
