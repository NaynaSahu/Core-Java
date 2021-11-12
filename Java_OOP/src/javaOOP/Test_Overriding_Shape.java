package javaOOP;

public class Test_Overriding_Shape {
	public static void main(String[] args) {
		// in method overriding we have to make parametric 
		//constructor for every child class 
		Shape1 c = new Circle1();
		Circle1 y = new Circle1();
		y.setRadius(7);
		System.out.println(c.area());
		
		/*
		 * Shape1 r = new Rectangle1(4,5); System.out.println(r.area());
		 * 
		 * Shape1 t = new Triangle1(4,3); System.out.println(t.area());
		 */	}

}
