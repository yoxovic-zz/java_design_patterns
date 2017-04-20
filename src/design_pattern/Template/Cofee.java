package design_pattern.Template;

public class Cofee extends CaffeineBeverage {

	@Override
	public void boilWater() {
		System.out.println("Water is boiling");
	}

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");

	}

	@Override
	public void pourInCup() {
		System.out.println("Pouring into cup");

	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Milk and Sugar");

	}

}
