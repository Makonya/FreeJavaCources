package com.java;

public class Runner {
    public static void main(String[] args) {
        doSmt();
        /**
         * Типы данных: примитивные, ссылочные(наследуются от Object)
         * */
        /**
         * byte, short, int, long - целочисленные
         * float, double - вещественные, дробные
         * boolean - логический
         * char - символьный: 'h'
         * */
        char ch = 'h';
        char ch2 = 'y';

        byte b = 1;
        Character b2 = 'j';

        doSmt2(ch2, true, "Trrr");
        /**
         * Обертки:
         * Byte, Short, Integer, Long(L)
         * Float(F), Double
         * Boolean
         * Character
         * */

        /**
         * String - "hello" - неизменяемый тип данных - при изменении создается новый объект
         * */
        String str = "helrrr";
//        str = "rrr";
        str = str + 2;
        char[] charArray = str.toCharArray();
        boolean flag = false;
        for (char c : charArray) {
            if(c == 'o'){
                flag = true;
            }
        }
        if(flag){
            System.out.println(str + " contains o");
        } else {
            System.out.println(str + " doesn't contains o");
        }

        /**
         * StringBuilder, StringBuffer - изменяемый тип данных
         * StringBuffer - потокобезопасный
         * append - метод, объединяет строки
         * */
        StringBuilder sb = new StringBuilder("sb");
        sb = sb.append("tt");
        sb = sb.reverse();
        StringBuffer stringBuffer = new StringBuffer();

    }

    private static void doSmt(){
        System.out.println("Doo");
    }
    private static MyValue doSmt2(char ch2, boolean b, String str){
        MyValue myValue = new MyValue();
        myValue.str = "Thh";
        myValue.flag = false;
        return myValue;
    }

}
