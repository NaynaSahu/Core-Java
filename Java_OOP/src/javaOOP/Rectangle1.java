package javaOOP;

public class Rectangle1 extends Shape1{
	private int length, width;

	public Rectangle1() {
	}

	public Rectangle1(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		return length * width;

	}

}
