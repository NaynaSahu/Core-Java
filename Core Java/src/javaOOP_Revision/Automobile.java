package javaOOP_Revision;

public class Automobile {
	
	private String colour;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 4;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void acceleration(int x) {
		speed = x + speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void breakk(int x) {
		speed = speed - x; // speed = 0
	}
	public void changeGear(int g) {
	   System.out.println(g);
	}

}
