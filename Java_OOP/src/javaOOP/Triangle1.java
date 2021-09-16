package javaOOP;

public class Triangle1 extends Shape1 {
	private int base, height;

	public Triangle1() {
	}

	public Triangle1(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public double area() {
		return 0.5 * height * base;
	}

}
