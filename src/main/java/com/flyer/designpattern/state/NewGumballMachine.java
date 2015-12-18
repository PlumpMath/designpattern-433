/**
 * 
 */
package com.flyer.designpattern.state;

/**
 * @author flyer
 *
 */
public class NewGumballMachine {

    private NoQuarterState noQuarterState;

    private HasQuarterState hasQuarterState;

    private SoldOutState soldOutState;

    private SoldState soldState;

    private WinnerState winnerState;

    private State state;

    private int count;

    public NewGumballMachine(int count) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot.");
        if (count != 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("NewGumballMachine{");
        sb.append("state=").append(state);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
