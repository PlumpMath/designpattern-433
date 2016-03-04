package com.flyer.designpattern.strategy;

/**
 * Created by xingzhan on 2016/3/4.
 */
public class Zhizhi implements QuackBehavior {
    @Override public void quack() {
        System.out.println("Zhizhi...");
    }
}
