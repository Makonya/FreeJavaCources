package com.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         *  ДЗ - Вывести строку содержащую значения от 1 до 100, через запятую
         * */
        StringBuilder stringBuilder = new StringBuilder();
//        String string = "";
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            if(i==n){
                stringBuilder.append(i);
            } else {
                stringBuilder.append(i).append(", ");
            }
        }
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);
//        System.out.println(string.substring(0, string.length()-2));


        /**
         * Потоки ввода/вывода: символьные(Reader, Writer) и байтовые(InputStream, OutputStream)
         * */

        /*Запись в файл*/
        File file = new File("1.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
            String string = "Hello World!";
            writer.write(string);

            /*writer.append('g');
            writer.append('h');*/

            writer.flush();
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Считывание с файла
         * */
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int c;
            String string = "";
            while ((c = fileReader.read()) != -1){
                string += (char)c;
            }
            System.out.println(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //----------------------------------
        
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * Коллекции(Collection):
         * List - список - работаем по индексу как в массиве
         * Set - множество(хранит уникальные элкменты)
         * Queue - очередь
         *
         * Map - ассоциативный массив/справочник - ключ + значение
         * */

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "яблоко");

        dictionary.get("apple");


        List<String> list = new ArrayList<>(12);
        list.add("Hi");
        list.add("World");

        list.get(0);

        String[] array = new String[10];
        array[0] = "Hi";
        array[1] = "World";
    }
}
