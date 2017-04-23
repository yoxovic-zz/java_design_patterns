package design_pattern.Builder;

public class CarBulderImpl implements CarBuilder {
	
	Car car;
	
	public CarBulderImpl() {
		car = new Car();
	}
	
	@Override
	public CarBuilder getWheels() {
		car.getNumOfWheels();
		return this;
	}
	
	@Override
	public CarBuilder setWheels(int num_wheels) {
		car.setNumofWheels(num_wheels);
		return this;
	}

	@Override
	public CarBuilder getColour() {
		car.getColour();
		return this;
	}
	
	@Override
	public CarBuilder setColour(String new_colour) {
		car.setColour(new_colour);
		return this;
	}

	@Override
	public Car build() {
		return car;
	}


}
