package design_pattern.Factory;

public class NewYork extends Pizza {

	public NewYork() {
		this.name = "NewYork Pizza";
	}

	@Override
	public void createPizza() {
		System.out.println("Pizza Type: " + this.name);
		
	}

}
