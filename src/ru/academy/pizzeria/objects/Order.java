package ru.academy.pizzeria.objects;

import java.util.List;

public class Order {

    private final String id;
    private final String clientName;
    private List<Pizza> pizzas;

    public Order(String id, String clientName) {
        this.id = id;
        this.clientName = clientName;
    }

    public boolean addPizza(Pizza pizza){
        pizzas.add(pizza);
        return true;
    }

//    public int getTotalCost(List<Pizza> pizzas){
    public int getTotalCost(){
        return 0;
    }
}
