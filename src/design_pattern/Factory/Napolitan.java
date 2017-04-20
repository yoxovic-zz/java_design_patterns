package design_pattern.Factory;

public class Napolitan extends Pizza {

	public Napolitan() {
		this.name = "Napolitan Pizza";
	}

	@Override
	public void createPizza() {
		System.out.println("Pizza Type: " + this.name);
		
	}

}
