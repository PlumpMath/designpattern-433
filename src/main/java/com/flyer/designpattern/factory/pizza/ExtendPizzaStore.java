package com.flyer.designpattern.factory.pizza;


public class ExtendPizzaStore {

    public static Pizza orderPizza(String type) {
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        }else if ("pepproni".equals(type)) {
            pizza = new PepproniPizza();
        }else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public static void main(String[] args) {
        ExtendPizzaStore.orderPizza("cheese");
    }

}
