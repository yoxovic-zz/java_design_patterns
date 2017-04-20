package design_pattern.Adapter;

public class WildTurkey implements Turkey {

	@Override
	public void fly() {
		System.out.println("I am flying short distances!");

	}

	@Override
	public void gobble() {
		System.out.println("Gobble gobble!");
		
	}

}
