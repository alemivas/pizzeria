package ru.academy.pizzeria.objects;

import java.util.List;

public class Kitchen {

    private Order order;
    private final int maxOrders;
    private final int currentOrders;

    public Kitchen(Order order, int maxOrders, int currentOrders) {
        this.order = order;
        this.maxOrders = maxOrders;
        this.currentOrders = currentOrders;
    }

    public void completeOrder(Order order){
        System.out.println(order.getTotalCost());
    }

    public boolean canAcceptOrder(){
        return true;
    }
}
