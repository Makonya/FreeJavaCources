package com.java;

public class Runner {
    private final String ERROR_MESSAGE;
    private static final int COUNT;
    private Inner inner;

    public void createInner(){
        inner = new Inner();
    }

    {
        ERROR_MESSAGE = "This is error";
    }

    static {
        COUNT = 34;
    }
    /**
     * Вложенный, статический класс
     * */
    static class Main{

    }

    /**
     * Внутренний класс
     * */
    private class Inner{

    }

    public static void main(String[] args) {
        Runner.Main main = new Runner.Main();

        for (Month value : Month.values()) {
            System.out.println(value);
            System.out.println("Name ru: " + value.getNameRu());
            System.out.println("Number of month: " + value.getCount());
            System.out.println("Season: " + value.getSeason());
        }

        /**
         * static - модификатор
         * 1) Статический импорт - импортируем статический данные с другого класса
         * import static com.java.Season.WINTER;
         *
         * 2) Статическая переменная - позволяет использовать переменные без создания объкета
         *
         * 3) Статический метод - позволяет использовать методы без создания объкета
         *
         * 4) Статичкий блок инициализации
         *
         * 5) Статический класс - вложенный класс
         * */
    }
}
