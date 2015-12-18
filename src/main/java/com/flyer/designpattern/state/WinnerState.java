package com.flyer.designpattern.state;

/**
 * Created by xingzhan on 2014/12/28.
 */
public class WinnerState implements State {
    private NewGumballMachine newGumballMachine;

    public WinnerState(NewGumballMachine newGumballMachine) {
        this.newGumballMachine = newGumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You can't insert quarter.");
    }

    @Override public void turnCrank() {
        System.out.println("You can't turn crank.");
    }

    @Override public void ejectQuarter() {
        System.out.println("You can't eject quarter.");
    }

    @Override public void dispense() {
        System.out.println("Your are a winner, you get two gumballs for your quarter.");
        newGumballMachine.releaseBall();
        if (newGumballMachine.getCount() == 0) {
            System.out.println("Out of gumballs.");
            newGumballMachine.setState(newGumballMachine.getSoldOutState());
        }else{
            newGumballMachine.releaseBall();
            if (newGumballMachine.getCount() > 0) {
                newGumballMachine.setState(newGumballMachine.getNoQuarterState());
            }
        }
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("WinnerState{");
        sb.append('}');
        return sb.toString();
    }
}
