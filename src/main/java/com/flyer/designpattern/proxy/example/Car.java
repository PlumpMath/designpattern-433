package com.flyer.designpattern.proxy.example;

/**
 * Created by xingzhan on 2017/4/12.
 */
public class Car implements IVehical {
    @Override public void run() {
        System.out.println("Car is running");
    }
}
