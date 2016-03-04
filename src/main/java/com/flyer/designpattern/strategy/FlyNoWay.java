package com.flyer.designpattern.strategy;

/**
 * Created by xingzhan on 2016/3/4.
 */
public class FlyNoWay implements FlyBehavior {
    @Override public void fly() {
        System.out.println("can not fly!");
    }
}
