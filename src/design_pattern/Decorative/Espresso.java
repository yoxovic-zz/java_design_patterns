package design_pattern.Decorative;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso Coffee";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
