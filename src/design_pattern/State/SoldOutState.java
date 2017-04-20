package design_pattern.State;

public class SoldOutState implements State {

	GumbBallMachine gumballMachine;

	public SoldOutState(GumbBallMachine gumbBallMachine) {
		this.gumballMachine = gumbBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can‘t insert a quarter, machine is sold out!");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can‘t eject a quarter, you haven‘t inserted a quarter!");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs!");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed!");		
	}

}
