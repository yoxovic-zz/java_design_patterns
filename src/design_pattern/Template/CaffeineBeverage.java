package design_pattern.Template;

public abstract class CaffeineBeverage {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void boilWater();

	public abstract void brew();

	public abstract void pourInCup();

	public abstract void addCondiments();

}
