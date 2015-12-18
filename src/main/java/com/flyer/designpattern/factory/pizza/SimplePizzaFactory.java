package com.flyer.designpattern.factory.pizza;

/**
 * Created by xingzhan on 2014/8/17.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        }else if ("pepproni".equals(type)) {
            pizza = new PepproniPizza();
        }else {
            pizza = new Pizza();
        }
        return pizza;
    }
}
