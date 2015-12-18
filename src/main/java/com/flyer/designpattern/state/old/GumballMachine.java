/**
 *
 */
package com.flyer.designpattern.state.old;

/**
 * @author flyer
 */
public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;

    int count = 0;

    /**
     * @param count
     */
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投入硬币
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter.");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't insert quarter, the machine is sold out.");
        }else if (state == SOLD) {
            System.out.println("Please wait, we have already giving you a gumball.");
        }
    }

    /**
     * 退回硬币
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("Quarter returned.");
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't insert a quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You can't eject, you haven't insert a quarter yet.");
        }else if (state == SOLD) {
            System.out.println("Sorry, you already turned the crank.");
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("You turned.");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {
            System.out.println("You turned, but there is no quarter.");
        } else if (state == SOLD_OUT) {
            System.out.println("You turned, but there is no gumballs.");
        }else if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball.");
        }
    }

    public void dispense() {
        if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed.");
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first.");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed.");
        }else if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot.");
            count--;
            if (count == 0) {
                System.out.println("Out of gumballs.");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        }
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("GumballMachine{");
        sb.append("state=").append(state);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
