package com.flyer.designpattern.factory.pizza;

/**
 * Created by xingzhan on 2014/8/17.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        nyPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("greek");
    }
}
