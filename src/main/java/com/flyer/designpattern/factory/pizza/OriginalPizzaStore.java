package com.flyer.designpattern.factory.pizza;


public class OriginalPizzaStore {

    public static OriginalPizza orderPizza() {
        OriginalPizza pizza = new OriginalPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        OriginalPizzaStore.orderPizza();
    }
}
