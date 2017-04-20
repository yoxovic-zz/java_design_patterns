package design_pattern.Factory;

public class Chicago extends Pizza{

	public Chicago() {
		this.name = "Chicago Pizza";
	}

	@Override
	public void createPizza() {
		
		System.out.println("Pizza Type: " + this.name);		
	}

}
