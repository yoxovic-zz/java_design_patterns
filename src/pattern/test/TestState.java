package pattern.test;

import design_pattern.State.GumbBallMachine;

public class TestState {

	public static void main(String[] args) {
		GumbBallMachine gumballMachine = new GumbBallMachine(50);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		
		
		

	}

}
