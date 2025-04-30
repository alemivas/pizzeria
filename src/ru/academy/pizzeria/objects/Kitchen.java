package ru.academy.pizzeria.objects;

// класс Кухня
public class Kitchen {

    private Order order;
    private final int maxOrders;
    private final int currentOrders;

    public Kitchen(Order order, int maxOrders, int currentOrders) {
        this.order = order;
        this.maxOrders = maxOrders;
        this.currentOrders = currentOrders;
    }

    // метод выполнения заказа
    public void completeOrder(Order order){
        System.out.println("клиент " + order.getClientName() +
                " заказал " + order.getTotalAmountPizzas() +
                " пиццы: " + order.getAllPizzaNames() +
                ", общая цена - " + order.getTotalCost() + " р.");
    }

    // проверка на возможность выполнения заказа
    public boolean canAcceptOrder(){
        return true;
    }
}
