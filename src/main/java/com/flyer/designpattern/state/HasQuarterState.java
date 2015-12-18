package com.flyer.designpattern.state;

import java.util.Random;

/**
 * Created by xingzhan on 2014/12/28.
 */
public class HasQuarterState implements State {
    private static Random random = new Random();
    private NewGumballMachine newGumballMachine;

    public HasQuarterState(NewGumballMachine newGumballMachine) {
        this.newGumballMachine = newGumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("You can't insert another quarter.");
    }

    @Override public void turnCrank() {
        System.out.println("You turned.");
        int winner = random.nextInt(5);
        if (winner == 0 && newGumballMachine.getCount() > 1) {
            newGumballMachine.setState(newGumballMachine.getWinnerState());
        } else {
            newGumballMachine.setState(newGumballMachine.getSoldState());
        }
    }

    @Override public void ejectQuarter() {
        System.out.println("Quarter returned.");
        newGumballMachine.setState(newGumballMachine.getNoQuarterState());
    }

    @Override public void dispense() {
        System.out.println("No gumball dispensed.");
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("HasQuarterState{");
        sb.append('}');
        return sb.toString();
    }
}
