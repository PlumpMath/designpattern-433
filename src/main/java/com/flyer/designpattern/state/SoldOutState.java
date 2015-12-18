package com.flyer.designpattern.state;

/**
 * Created by xingzhan on 2014/12/28.
 */
public class SoldOutState implements State {

    private NewGumballMachine newGumballMachine;

    public SoldOutState(NewGumballMachine newGumballMachine) {
        this.newGumballMachine = newGumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You can't insert quarter, the machine is sold out.");
    }

    @Override public void turnCrank() {
        System.out.println("You turned, but there is no gumballs.");
    }

    @Override public void ejectQuarter() {
        System.out.println("You can't eject, you haven't insert a quarter yet.");
    }

    @Override public void dispense() {
        System.out.println("No gumball dispensed.");
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("SoldOutState{");
        sb.append('}');
        return sb.toString();
    }
}
