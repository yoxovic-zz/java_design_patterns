package design_pattern.Factory;

public class PizzaFactory {
	Pizza pizza;

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("napolitan")) {
			pizza = new Napolitan();
		} else if (type.equals("chicago")) {
			pizza = new Chicago();
		} else if (type.equals("newyork")) {
			pizza = new NewYork();
		} else if (type.equals("sicilian")) {
			pizza = new Sicilian();
		}
		return pizza;
	}

}
