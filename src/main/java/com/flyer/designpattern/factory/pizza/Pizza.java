package com.flyer.designpattern.factory.pizza;

public class Pizza {

    public void prepare() {
        System.out.println("prepare the pizza");
    }

    public void bake() {
        System.out.println("bake the pizza");
    }

    public void cut() {
        System.out.println("cut the pizza");
    }

    public void box() {
        System.out.println("box the pizza");
    }
}
