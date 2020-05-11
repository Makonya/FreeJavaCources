package com.java;

public interface Runnable {
    /**
     * В интерфейсе все поля константы:
     * public static final
     * */
    String MODEL = "lux";

    /**
     * Все методы интерфейса имеют модификаторы:
     * public abstract
     * */
    void run();

    default void doDefaultThings(){
        System.out.println("I'm default method");
    }
}
