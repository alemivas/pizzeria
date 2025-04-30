package ru.academy.pizzeria.objects;

import java.util.List;

// класс Заказ
public class Order {

    private final String id;
    private final String clientName;
    private List<Pizza> pizzas;

    public Order(String id, String clientName, List<Pizza> pizzas) {
        this.id = id;
        this.clientName = clientName;
        this.pizzas = pizzas;
    }

    public String getClientName(){
        return clientName;
    }

    // добавить пиццу к заказу
    public boolean addPizza(Pizza pizza){
        pizzas.add(pizza);
        return true;
    }

    // получить общую сумму заказа
    // стоимость одной пиццы считается как произведение размера на цену (price)
    public int getTotalCost(){
        int totalCost = 0;
        int currentPizzaCost = 0;
        System.out.println("расчет общей стоимости заказа:");
        for (Pizza pizza: pizzas){
            currentPizzaCost = pizza.getSize() * pizza.getPrice();
            System.out.println("стоимость пиццы " + pizza.getName() + ": размер " + pizza.getSize() + " * цена " + pizza.getPrice()+ " = " + currentPizzaCost);
            totalCost += currentPizzaCost;
        }
        return totalCost;
    }

    // получить общее количество пицц в заказе
    public int getTotalAmountPizzas(){
        return pizzas.size();
    }

    // получить названия всех пицц в заказе в виде строки
    public String getAllPizzaNames(){
        StringBuilder allPizzaNames = new StringBuilder();
        for (Pizza pizza: pizzas){
            allPizzaNames.append(pizza.getName() + " и ");
        }
        return String.valueOf(allPizzaNames);
    }
}
