package javaOOP;

public class Triangle extends Shape {
	private double base, height;
	private final double half = 0.5;

	public Triangle() {

	}

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;

	}

	public double area() {
		return half * base * height;
	}

}
