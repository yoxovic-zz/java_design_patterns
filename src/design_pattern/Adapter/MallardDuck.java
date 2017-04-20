package design_pattern.Adapter;

public class MallardDuck implements Duck{

	@Override
	public void fly() {
		System.out.println("I am flying!");
	}

	@Override
	public void quack() {
		System.out.println("Quack!");

	}

}
