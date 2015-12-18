package com.flyer.designpattern.factory.pizza;

/**
 * Created by xingzhan on 2014/8/17.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        }else if ("greek".equals(type)) {
            pizza = new ChicagoStyleGreekPizza();
        }else if ("pepproni".equals(type)) {
            pizza = new ChicagoStylePepproniPizza();
        }else {
            pizza = new Pizza();
        }

        return pizza;
    }
}
