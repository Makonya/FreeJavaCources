package com.java;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * 5 конструкций для обработки исключений:
         * try - помещаем код, который может сгенерировать ошибку
         * catch - ловим ошибку, возникшую в блоке try
         * finally - выполняется всегда, в не зависимости от ошибки(возникла или нет), кроме  System.exit(code);
         * throw - генерирует новyю ошибку
         * throws - пробрасывает исключение, в вызывающий метод
         * */

        int result = 0;
        try {
            result = 4/0;
        } catch (ArithmeticException e){
//            System.exit(0);
            System.out.println("Don't divide by zero!!!");
        } finally {
            System.out.println("Finally block!");
        }
        System.out.println(result);

        try {
            doSmt();
        } catch (CheckException ex){
            System.out.println(ex.getMessage() + " User entered number = " + ex.getNumber());
        }

    }

    private static void doSmt() throws CheckException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:");
        int n = scanner.nextInt();
        if(n>0){
            System.out.println("OK");
        } else {
            throw new CheckException("Number should be greater than zero!", n);
        }
    }
}
