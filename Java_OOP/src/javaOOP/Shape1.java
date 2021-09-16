package javaOOP;

public class Shape1 {
	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	private String colour;
	private int borderWidth;

	public Shape1() {

	} 

	public Shape1(String colour, int borderWidth) {
		this.colour = colour;
		this.borderWidth = borderWidth;

	}

	public String getColur() {
		return colour;
	}

	public int getBorderWidth() {
		return borderWidth;
	}
	public double area() {
		return 0;
		
	}

}
