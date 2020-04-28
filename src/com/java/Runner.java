package com.java;

public class Runner {
    public static void main(String[] args) {
        Student studentIvan = new Student();
        studentIvan.printStudent();
        System.out.println(studentIvan);

        /**
         * Целочисленные
         * byte
         * short
         * int
         * long
         * */
        byte countByte = 2; // -127 +127
        int count = countByte;
        int count2 = 3 * countByte - 10;
        short countShort = (short) count;
        System.out.println("3 * countByte - 10: " + count2);

        /**
         * Вещественные
         * float
         * double
         * */
        double doubleCount = 4.6;
        System.out.println(doubleCount);

        /**
         * Символьный
         * char
         * */
        char letter = 'w';
        System.out.println("Char: " + letter);

        /**
         * Логический
         * boolean
         * */
        boolean flag = (count == count2);
        System.out.println(flag);

        String str = "NEW String";
        System.out.println(str);

        if(count2 == -4){
            System.out.println("Equal -4");
        } else {
            System.out.println("Not equal -4");
        }
    }
}
