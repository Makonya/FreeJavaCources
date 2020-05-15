package kz.beeline.my;

public class MobilePhone {
    /**
     * Поля - характеристика
     * */
    private double price;
    private double innerMemory;

    /**
     * Конструктор
     * */
    public MobilePhone(){

    }

    /**
     * Getters, setters
     * Геттеры, сеттеры
     * */
    public void setPrice(double price){
        this.price = price;
    }

    public double getInnerMemory(){
        return innerMemory;
    }

    /**
     * Метод - действие
     * */
    public void doublePrice(){
        price = price * 2;
    }
}
