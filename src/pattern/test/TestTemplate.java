package pattern.test;

import design_pattern.Template.*;

public class TestTemplate {

	public static void main(String[] args) {

		// Template pattern without HOOK
		Cofee coffeRecepie = new Cofee();
		Tea teaRecepie = new Tea();

		// prepare new coffee
		System.out.println("Making coffee...");
		coffeRecepie.prepareRecipe();

		// prepare new tea
		System.out.println("\nMaking tea...");
		teaRecepie.prepareRecipe();

		// Template pattern with HOOK
		CoffeeWithHook coffeRecepieWithHook = new CoffeeWithHook();
		TeaWithHook teaRecepieWithHook = new TeaWithHook();
		
		System.out.println("\nMaking coffee with hook...");
		coffeRecepieWithHook.prepareRecipe();

		System.out.println("\nMaking tea with hook...");
		teaRecepieWithHook.prepareRecipe();
	}

}
