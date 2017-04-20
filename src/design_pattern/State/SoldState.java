package design_pattern.State;

public class SoldState implements State {

	GumbBallMachine gumballMachine;

	public SoldState(GumbBallMachine gumbBallMachine) {
		this.gumballMachine = gumbBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait, we‘re already giving you a gumball!");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank!");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning crank twice doesn‘t get you another gumball!");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			
		}
		else{
			System.out.println("Machine is out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
