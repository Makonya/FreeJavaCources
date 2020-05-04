package com.java;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * Двумерный массив
         * */
        int[][] array = new int[][]{{1, 2, 3, 4},
                                    {9, 4, 6, 7}};
        /**
         * Доступ к элементу двумерного массива
         * */
        System.out.println(array[0][1]); // [строка][столбец]

        /**
         * Вызов методов
         * */
        printTable(3, 5);

        int sum = sum(2, 3);
        System.out.println("Summa = " + sum);
        proizv(2, 3);

        String fio = getFio();
        System.out.println(fio);

        String fio2 = getFio("Ivanov", "Ivan");
        System.out.println(fio2);
    }

    /**
     * Метод распечатывает таблицу умножения 10*10
     */
    public static void printTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("------------------");
        }
    }

    /**
     * Метод распечатывает таблицу умножения, учитывая заданные параметры
     */
    public static void printTable(int from, int to) {
        for (int i = 1; i <= from; i++) {
            for (int j = 1; j <= to; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("------------------");
        }
    }

    /**
     * Объявление метода:
     * модификатор доступа - тип возвращаемое значение - название метода (входные параметры) { тело метода}
     */

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void proizv(int a, int b) {
        System.out.println("Proizvedenie = " + a * b);
    }

    /**
     * Перегрузка метода - overload
     * Несколько методов в классе с одинаковыми названиеми, но разными входными параметрами
     * */
    public static String getFio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String fio = scanner.nextLine();
        return fio;
    }

    public static String getFio(String fam, String name) {
        return fam + " " + name;
    }
}
