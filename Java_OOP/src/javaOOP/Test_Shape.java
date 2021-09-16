package javaOOP;

public class Test_Shape {// polymorphism
	public static void main(String[] args) {
		Shape1[] r = new Shape1[3];
		r[0] = new Rectangle1(2, 4);
		r[1] = new Circle1(4);
		r[2] = new Triangle1(4, 5);

		System.out.println(r[0].area());// at runtime behavior
		System.out.println(r[1].area());// will change
		System.out.println(r[2].area());

	}
	

}
