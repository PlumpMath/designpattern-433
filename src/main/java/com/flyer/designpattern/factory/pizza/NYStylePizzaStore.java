package com.flyer.designpattern.factory.pizza;

/**
 * Created by xingzhan on 2014/8/17.
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new NYStyleGreekPizza();
        } else if ("pepproni".equals(type)) {
            pizza = new NYStylePepproniPizza();
        } else {
            pizza = new Pizza();
        }

        return pizza;
    }
}
