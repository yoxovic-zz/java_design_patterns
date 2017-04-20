package design_pattern.Factory;

public class Sicilian extends Pizza {

	public Sicilian() {
		this.name = "Sicilian Pizza";
	}

	@Override
	public void createPizza() {
		System.out.println("Pizza Type: " + this.name);
	}

}
