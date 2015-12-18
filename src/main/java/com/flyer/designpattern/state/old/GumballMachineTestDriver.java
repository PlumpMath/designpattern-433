package com.flyer.designpattern.state.old;

/**
 * Created by xingzhan on 2014/12/28.
 */
public class GumballMachineTestDriver {

    private final static int DEFAULT_GUMBALL_SIZE = 5;

    public static void main(String[] args) {
        GumballMachine gumballMachine1 = new GumballMachine(DEFAULT_GUMBALL_SIZE);
        System.out.println(gumballMachine1.toString());
        System.out.println("");

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1.toString());
        System.out.println("");

        gumballMachine1.insertQuarter();
        gumballMachine1.ejectQuarter();
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1.toString());
        System.out.println("");

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        gumballMachine1.ejectQuarter();
        System.out.println(gumballMachine1.toString());
        System.out.println("");

        gumballMachine1.insertQuarter();
        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1.toString());
        System.out.println("");

        gumballMachine1.insertQuarter();
        gumballMachine1.turnCrank();
        System.out.println(gumballMachine1.toString());
        System.out.println("");
    }
}
