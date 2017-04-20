package design_pattern.State;

public class NoQuarterState implements State {

	GumbBallMachine gumballMachine;
	
	public NoQuarterState(GumbBallMachine gumbBallMachine) {
		this.gumballMachine = gumbBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter!");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven’t inserted a quarter!");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there is no quarter!");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first!");		
	}

}
