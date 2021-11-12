package ExerciseOOP;

public class Rectangle extends Shape {
	private double l;
	private double b;

	public Rectangle() {

	}

	public Rectangle(double l,double b) {
    this.b=b;
    this.l=l;
	}

	public double area() {

		return l * b;
	}

}
