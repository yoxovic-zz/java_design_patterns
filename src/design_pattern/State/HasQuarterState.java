package design_pattern.State;

public class HasQuarterState implements State {
	
	GumbBallMachine gumballMachine;

	public HasQuarterState(GumbBallMachine gumbBallMachine) {
		this.gumballMachine = gumbBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can‘t insert another quarter!");
		
	}

	@Override
	public void ejectQuarter() {
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		System.out.println("Quarter returned!");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first!");		
	}

}
