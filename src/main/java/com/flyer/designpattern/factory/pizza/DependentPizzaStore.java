package com.flyer.designpattern.factory.pizza;

/**
 * Created by xingzhan on 2014/8/17.
 */
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if ("cheese".equals(type)) {
                pizza = new NYStyleCheesePizza();
            } else if ("greek".equals(type)) {
                pizza = new NYStyleGreekPizza();
            } else if ("pepproni".equals(type)) {
                pizza = new NYStylePepproniPizza();
            }
        }else if (style.equals("Chicago")) {
            if ("cheese".equals(type)) {
                pizza = new ChicagoStyleCheesePizza();
            }else if ("greek".equals(type)) {
                pizza = new ChicagoStyleGreekPizza();
            }else if ("pepproni".equals(type)) {
                pizza = new ChicagoStylePepproniPizza();
            }
        }else{
            System.out.println("Error, invalid parameter");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
