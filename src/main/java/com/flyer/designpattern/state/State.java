package com.flyer.designpattern.state;

/**
 * Created by xingzhan on 2014/12/28.
 */
public interface State {

    void insertQuarter();

    void turnCrank();

    void ejectQuarter();

    void dispense();
}
