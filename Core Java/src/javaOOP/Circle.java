package javaOOP;

public class Circle extends Shape  {
	private final double PI = 3.14;
	private int radius;
	public Circle() {
		
	}

	public Circle(int radius) {
		this.radius = radius;

	}

	public double area() {
		return PI * radius * radius;

	}

}
