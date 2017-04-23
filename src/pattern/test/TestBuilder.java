package pattern.test;

import design_pattern.Builder.*;

public class TestBuilder {

	public static void main(String[] args) {
		CarBuilder carBuilder = new CarBulderImpl();
		carBuilder.setColour("Red colour");
		carBuilder.setWheels(4);
		carBuilder.build();
		System.out.println(carBuilder.getColour().getWheels().build());
	}

}
