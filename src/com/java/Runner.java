package com.java;

import kz.beeline.my.Person;
import kz.beeline.my.Sex;

public class Runner {
    public static void main(String[] args) {
        /**
         * Code Convention (правила написания языка)
         *
         * 1) Название пакетов - kz.beeline.my (разделяются точкой, доменное имя сайта(https://my.beeline.kz/))
         *
         * 2) Название классов - совпадает с названием файла, с заглавной буквы, camel case(верблюжий стиль)
         *
         * 3) Название переменных(сущ) - camel case(верблюжий стиль), первая буква в нижнем регистре
         *
         * 4) Название методов(действие - глагол) - camel case(верблюжий стиль), первая буква в нижнем регистре
         *
         * 5) Конструктор - совпадает с названием класса
         *
         * 6) Геттеры, сеттеры - начинаются с ключевых слов get|set + название переменной, camel case(верблюжий стиль)
         *
         * 7) Константы - пишутся в верхнем регистре, разделяются нижним подчеркиванием(_)
         *
         * 7) Для форматирования - Ctrl + Alt + L
         * */


        /**
         * Enum - перечисление
         * Перечисляются через запятую, пишутся в верхнем регистре, разделяются нижним подчеркиванием(_)
         * */
        Person man1 = new Person(94,"Ivan", Sex.MALE);
        Person man2 = new Person(35, "Ken", Sex.MALE);
        Person woman1 = new Person(56, "Masha", Sex.FEMALE);
        Person woman2 = new Person(43,"Katya", Sex.FEMALE);
        Person woman3 = new Person(88,"Anji", Sex.FEMALE);

        Person[] peopleArray = new Person[5];
        peopleArray[0] = man1;
        peopleArray[1] = man2;
        peopleArray[2] = woman1;
        peopleArray[3] = woman2;
        peopleArray[4] = woman3;

        for (int i = 0; i < peopleArray.length; i++) {
            System.out.println(peopleArray[i]);
        }

        int womanCount = 0;
        int manCount = 0;

        for (int i = 0; i < peopleArray.length; i++) {
            if(peopleArray[i].getSex() == Sex.MALE){
                manCount = manCount + 1; // manCount++;
            } else if(peopleArray[i].getSex() == Sex.FEMALE){
                womanCount ++;
            }
        }

        System.out.println("woman count = " + womanCount);
        System.out.println("man count = " + manCount);
    }
}
