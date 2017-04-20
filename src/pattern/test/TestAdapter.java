package pattern.test;

import design_pattern.Adapter.*;

public class TestAdapter {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		Duck turkeyAdadpter = new TurkeyAdapter(wildTurkey);
		
		wildTurkey.fly();
		wildTurkey.gobble();
		
		TestDuck(mallardDuck);
		
		TestDuck(turkeyAdadpter);
			 
	}

	public static void TestDuck(Duck duck) {
		duck.quack();
		duck.fly();
	
	}

}
