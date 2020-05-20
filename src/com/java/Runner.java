package com.java;

public class Runner {
    public static void main(String[] args) {
        /**
         * Объвление переменной - указание типа переменной, названия
         * */
        int val;

        /**
         * Инициализация переменной - задание значения переменной
         * */
        val = 0;
        val++;
        System.out.println(Season.WINTER);
        if (true) {
            int temp = 5;
            System.out.println(temp);
        }
        int mainMethodVariable = 8;
        doSmt(mainMethodVariable);

        /**
         * break - выходит с цикла
         * */
        int n = 1;
        for (int i = 0; i < 10; i++) {
            if (n > 12) {
                break;
            } else {
                n = n * 2;
            }
        }
        /**
         * continue - переходит на следующую итерацию цикла
         * % - остаток от деления
         * */
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }

        /**
         * Обработка исключений
         * */
        try{
            int result = 2/0;
        } catch (ArithmeticException ex){
            ex.printStackTrace();
        }

        System.out.println("Bye");
    }

    private static void doSmt(int val) {
        val++;
    }
}

enum Season {
    WINTER,
    SUMMER
}
