package design_pattern.Decorative;

public abstract class Beverage {
	 String description = "This is unknown beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	 
	 

}
