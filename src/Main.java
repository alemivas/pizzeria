import ru.academy.pizzeria.objects.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //создаем список пицц для заказа
        Pizza pizza1 = new Pepperoni(12);
//        Pizza pizza2 = new Hawaiian(30, 3);
        Pizza pizza2 = new Hawaiian(30);
        ArrayList<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(pizza1);
        pizzaList.add(pizza2);

        //создаем заказ
        Order order1 = new Order("заказ 1", "Иван", pizzaList);

        //выполняем заказ
        Kitchen kitchen = new Kitchen(order1, 5, 1);
        kitchen.completeOrder(order1);
    }
}