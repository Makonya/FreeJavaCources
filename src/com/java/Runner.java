package com.java;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int[] array = {2, 4, -7, 8, 9, 10};
        printArray(array);
        /**
         * For loop
         * */
        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }

        /**
         * Foreach = для каждого
         * */
        System.out.println("Foreach");
        double sum = 0;
        for (int item : array) {
            sum = sum + item;
        }
        System.out.println("Sum: " + sum);

        /**
         * while - пока
         * */
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equals("hi")) {
            System.out.println("Write: hi");
        }

        /**
         * do{}while()
         * */
        do {
            System.out.println("Write: bye");
        } while (!scanner.nextLine().equals("bye"));

        int min = 0;
        int minIndex = 0;
        int max = 0;
        int maxIndex = 0;
        /**
         * Поиск минимального и максимального значения
         * */
        for (int i = 0; i < array.length; i++) {
            if(i==0){
                min = array[i];
                max = array[i];
                continue;
            }
            if(min > array[i]){
                min = array[i];
                minIndex = i;
            }
            if(max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        /**
         * Меняем местами макс и мин
         * */
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        printArray(array);
    }

    /**
     * Метод для отображения элементов массива
     * */
    public static void printArray(int[] array){
        String arrayStr = new String();
        for (int i : array) {
            arrayStr += i + ", ";
        }
        System.out.println("Array:");
        System.out.println(arrayStr.substring(0, arrayStr.length()-2));
    }
}
