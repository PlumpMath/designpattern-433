package com.flyer.designpattern.state;

/**
 * Created by xingzhan on 2014/12/28.
 */

public class NoQuarterState implements State {

    private NewGumballMachine newGumballMachine;

    public NoQuarterState(NewGumballMachine newGumballMachine) {
        this.newGumballMachine = newGumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        newGumballMachine.setState(newGumballMachine.getHasQuarterState());
    }

    @Override public void turnCrank() {
        System.out.println("You turned, but there is no quarter.");
    }

    @Override public void ejectQuarter() {
        System.out.println("You haven't insert a quarter.");
    }

    @Override public void dispense() {
        System.out.println("You need to pay first.");
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("NoQuarterState{");
        sb.append('}');
        return sb.toString();
    }
}
