package ExerciseOOP;

public abstract class Shape {
	public abstract double area() ;
	public void Shapearea() {
		Shape[] y = new Shape[3];
		y[0]= new Circle(2);
		y[1]= new Rectangle(3,4);
		y[2]= new Triangle(3,4);
		double x =y[0].area()+y[1].area()+y[2].area();
		System.out.println(x);
		
	}
	public static int number() {
		return 0;
		
	}

}
