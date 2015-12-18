package com.flyer.designpattern.state;

/**
 * Created by xingzhan on 2014/12/28.
 */
public class NewGumballMachineDriver {

    public static void main(String[] args) {
        NewGumballMachine newGumballMachine = new NewGumballMachine(5);

        newGumballMachine.insertQuarter();
        newGumballMachine.turnCrank();
        System.out.println(newGumballMachine.toString());
        System.out.println("");

        newGumballMachine.insertQuarter();
        newGumballMachine.turnCrank();
        System.out.println(newGumballMachine.toString());
        System.out.println("");

        newGumballMachine.insertQuarter();
        newGumballMachine.turnCrank();
        System.out.println(newGumballMachine.toString());
        System.out.println("");
    }
}
