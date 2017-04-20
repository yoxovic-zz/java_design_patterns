package design_pattern.Template;

public class Tea extends CaffeineBeverage {

	@Override
	public void boilWater() {
		System.out.println("Water is boiling!");

	}

	@Override
	public void brew() {
		System.out.println("Steeping the tea!");
		
	}

	@Override
	public void pourInCup() {
		System.out.println("Pouring into cup");
		
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
		
	}

}
