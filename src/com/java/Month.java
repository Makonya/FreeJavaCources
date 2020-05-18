package com.java;

import static com.java.Season.WINTER;

public enum Month {
    JANUARY("Январь", 1, WINTER),    // Январь
    FEBRUARY("Февраль", 2, WINTER),
    MARCH("Март", 3, Season.SPRING),
    JUNE("Июнь", 6, Season.SUMMER),
    SEPTEMBER("Сентябрь", 9, Season.FALL);

    /**
     * Поля перечисления
     * */
    private String nameRu;
    private int count;
    private Season season;

    /**
     * Конструктор перечисления
     * */
    Month(String nameRu, int count, Season season) {
        this.nameRu = nameRu;
        this.count = count;
        this.season = season;
    }

    /**
     * Геттеры - getters - методы для получения значений полей
     * */
    public String getNameRu() {
        return nameRu;
    }

    public int getCount() {
        return count;
    }

    public Season getSeason() {
        return season;
    }
}
