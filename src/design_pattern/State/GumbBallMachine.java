package design_pattern.State;

public class GumbBallMachine {

	State noQuarterState;
	State hasQuarterState;
	State soldOutState;
	State soldState;

	State state = soldOutState;
	int count = 0;
	
	public GumbBallMachine(int numGumballs) {

		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		
		this.count = numGumballs;
		
		if(count > 0){
			state = noQuarterState;
			
		}

	}
	
	public void insertQuarter(){
		state.insertQuarter();
		
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
		
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	void releaseBall(){
		if(count != 0){
			System.out.println("Gumball is rolling out right now...");
			count = count - 1;
		}
	}
	
	void refill(int count){
		this.count = count;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
