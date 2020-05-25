package com.java;

/**
 * Создание кастомного исключения
 * */
public class CheckException extends Exception {
    private int number;

    public CheckException(String message, int number) {
        super(message);
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}
