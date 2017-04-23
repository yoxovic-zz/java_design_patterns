package design_pattern.Builder;

public interface CarBuilder {
	CarBuilder getWheels();
	CarBuilder setWheels(int num_wheels);
	CarBuilder getColour();
	CarBuilder setColour(String new_colour);
	Car build();
}
