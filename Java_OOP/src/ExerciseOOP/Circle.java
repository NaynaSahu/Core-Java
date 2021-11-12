package ExerciseOOP;

public class Circle extends Shape {
    private int radius;
	public Circle() {

	}

	public Circle(int r) {
     radius = r;
	}
	public static int number() {
		return 0 ;
		
	}

	public double area() {
		return 3.14*radius*radius;

	}

}
