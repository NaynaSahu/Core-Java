package javaOOP;

public class Automobile extends Person {

	private String colour;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public void breakk() {
		int i = getSpeed();
		i = 0;
		
	}
	public void accelerator(int x) {
		int spe = getSpeed();
		spe = spe + x ;
		spe = getSpeed();
	
		
		
	}

}
