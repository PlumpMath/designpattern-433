package com.flyer.designpattern.strategy;

/**
 * Created by xingzhan on 2016/3/4.
 */
public class DuckClient {

    public static void main(String[] args) {
        MalilanDuck malilanDuck = new MalilanDuck();
        malilanDuck.setFlyBehavior(new FlyWithWings());
        malilanDuck.setQuackBehavior(new Guagua());
        ChinaDuck chinaDuck = new ChinaDuck();
        chinaDuck.setFlyBehavior(new FlyNoWay());
        chinaDuck.setQuackBehavior(new Zhizhi());

        malilanDuck.fly();
        malilanDuck.quack();
        chinaDuck.fly();
        chinaDuck.quack();
    }
}
