package javaOOP;

public class Test_Circle {
	public static void main(String[] args) {//Inheritence
		Circle1 c = new Circle1(5);
		c.setColour("red");// method - Shape1
		c.setBorderWidth(67);
		c.setRadius(5);
		
		System.out.println(c.getBorderWidth());
		System.out.println(c.getColur());
		System.out.println(c.getRadius());
		System.out.println(c.area());
		
		// instanceation with child instance by parents class
		Shape1 r = new Circle1(45);
		r.setBorderWidth(56);
		r.setColour("red");
		//r.area(); ->> will give error as instanceated with 
		//child class and an object of parent class , so 
		//only parents provided methods will be accessible  
		
		
		
	}

}
