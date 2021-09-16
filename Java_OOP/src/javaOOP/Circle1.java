package javaOOP;

public class Circle1 extends Shape1 {
	private int radius;
	public static final double PI = 3.14;

	public Circle1() {

	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle1(int radius) {
		this.radius = radius;

	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		return PI * radius * radius;

	}

}
