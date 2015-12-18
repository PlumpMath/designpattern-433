package com.flyer.designpattern.state;

/**
 * Created by xingzhan on 2014/12/28.
 */
public class SoldState implements State {
    private NewGumballMachine newGumballMachine;

    public SoldState(NewGumballMachine newGumballMachine) {
        this.newGumballMachine = newGumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("Please wait, we have already giving you a gumball.");
    }

    @Override public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball.");
    }

    @Override public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank.");
    }

    @Override public void dispense() {
        newGumballMachine.releaseBall();
        if (newGumballMachine.getCount() > 0) {
            newGumballMachine.setState(newGumballMachine.getNoQuarterState());
        }else{
            System.out.println("Out of gumballs.");
            newGumballMachine.setState(newGumballMachine.getSoldOutState());
        }
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("SoldState{");
        sb.append('}');
        return sb.toString();
    }
}
