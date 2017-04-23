package design_pattern.Builder;

public class Car {
	int wheels;
	String colour;

	public Car() {
	}

	public int getNumOfWheels() {
		return this.wheels;
	}

	public void setNumofWheels(int num_wheels) {
		this.wheels = num_wheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String new_colour) {
		this.colour = new_colour;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car [Number of wheels = " + wheels + ", Colour = " + colour + "]";
	}

}
