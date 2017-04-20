package design_pattern.Factory;

public abstract class Pizza {
	String name;
	
	public abstract void createPizza();
	
	public String toString(){
		return this.name;
	}

}
