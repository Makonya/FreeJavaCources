package com.java;

public class Runner {
    public static void main(String[] args) {
        /**
         * 3 основные парадигмы ООП(3 кита ООП):
         * - Наследование
         * - Инкапсуляция - сокрытие реализации
         * - Полиморфизм - название одно, реализация разная
         * */

        BMWX6 bmwx6 = new BMWX6("black");
        AudiA80 audiA80 = new AudiA80("red");

        bmwx6.run();
        bmwx6.stop();
        bmwx6.doDefaultThings();

        BMWX6.doSmt();

        audiA80.run();
        audiA80.stop();

        String model = Runnable.MODEL;
        System.out.println(model);

        /**
         * abstract
         * 1) abstract class(Класс) - нельзя создать объекты данного класса
         * 2) abstract method(Метод) - не имеет реализации
         * */
    }
}
