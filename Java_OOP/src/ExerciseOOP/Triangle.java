package ExerciseOOP;

public class Triangle extends Shape {
	private int b;
	private int h;

	public Triangle() {

	}

	public Triangle(int b ,int h) {
		this.b=b;
		this.h=h;

	}

	public double area() {
		return 0.5 * b * h;

	}

}
