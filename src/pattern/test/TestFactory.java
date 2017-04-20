package pattern.test;

import design_pattern.Factory.*;


public class TestFactory {

	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza = store.orderPizza("chicago");
		System.out.println(pizza);
		pizza.createPizza();
		
		Pizza pizza2 = store.orderPizza("NAPOLITAN".toLowerCase());
		System.out.println(pizza2);
		pizza2.createPizza();
	}

}
