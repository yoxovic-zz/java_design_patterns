package pattern.test;

import design_pattern.Decorative.*;

public class TestDecorator {

	public static void main(String[] args) {
		
		Beverage coffee = new HouseBlend();
		
		coffee = new Milk(coffee);
		System.out.println("Beverage: "+ coffee.getDescription() + "; Beverage price: $" + coffee.cost());
		
		coffee = new Whip(coffee);
		System.out.println("Beverage: "+ coffee.getDescription() + "; Beverage price: $" + coffee.cost());
		
		Beverage espresso = new Espresso();
		espresso = new Milk(espresso);
		espresso = new Soy(espresso);
		espresso = new Whip(espresso);
		System.out.println("Beverage: "+ espresso.getDescription() + "; Beverage price: $" + espresso.cost());
		
		Beverage beverage = new Whip(new Milk(new Espresso()));
		System.out.println("Beverage: "+ beverage.getDescription() + "; Beverage price: $" + beverage.cost());
		
		
	}

}
