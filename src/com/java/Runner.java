package com.java;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * Считывание с консоли
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "!");

        /**
         * Условные конструкции:
         * <  - меньше
         * >  - больше
         * == - равно
         * != - не равно
         * */
        boolean flag = false;
        int first = 11;
        if (first > 10) {
            System.out.println("more than 10");
        } else if (first == 9) {
            System.out.println("9");
        } else {
            System.out.println("Other digit!");
        }

        /**
         * Switch-case
         * */
        switch (first) {
            case 9:
                System.out.println("Nine");
                break;
            case 6:
                System.out.println("Six");
                break;
            default:
                System.out.println("default");
                break;
        }

        /**
         * Тернарный оператор
         * (условие) ? (действие, если истина) : (действие, если ложь)
         * */
        String str2 = first > 10 ? "More than 10" : "Less than 10";
        System.out.println(str2);

        /**
         * Массивы
         * */
        int[] intArray = new int[5];
        intArray[0] = 2;
        intArray[1] = 4;
        intArray[2] = -3;
        intArray[3] = 5;
        intArray[4] = 8;

        System.out.println(intArray[1]);

        int[] intArray2 = {2, 4, 7, 8, 9, 10};
        System.out.println(intArray2[3]);

        System.out.println(intArray2.length);

        /**
         * Нахождение максимального значения
         * */
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        System.out.println("Max value: " + max);
    }
}
