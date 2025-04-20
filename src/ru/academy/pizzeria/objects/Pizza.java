package ru.academy.pizzeria.objects;

// базовый класс всех видов пицц
public abstract class Pizza {

    private final String name;
    private final int size;
    private final int price;

    public Pizza(String name, int size, int price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public int getPrice(){
        return price;
    }
}
