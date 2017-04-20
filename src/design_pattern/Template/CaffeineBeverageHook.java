package design_pattern.Template;

public abstract class CaffeineBeverageHook {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (CustomerWantsCondiments()) {
			addCondiments();
		}
		
	}

	public abstract void boilWater();

	public abstract void brew();

	public abstract void pourInCup();

	public abstract void addCondiments();
	
	public boolean CustomerWantsCondiments(){
		return true;
	}

}
