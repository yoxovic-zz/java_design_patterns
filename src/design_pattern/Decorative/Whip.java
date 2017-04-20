package design_pattern.Decorative;

public class Whip extends CondimentDecorator {
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip Cream";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1.49;
	}

}
