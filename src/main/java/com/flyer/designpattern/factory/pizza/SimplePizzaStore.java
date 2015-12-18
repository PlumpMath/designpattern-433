package com.flyer.designpattern.factory.pizza;

/**
 * Created by xingzhan on 2014/8/17.
 */
public class SimplePizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public SimplePizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza() {
        Pizza pizza = pizzaFactory.createPizza("cheese");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
