package Encapsulation;

public class TestConstructor {
	public static void main(String[] args) {
		// Default Constructor 
		Constructor x = new Constructor() ;
		// Parameterized Constructor
		Constructor y = new Constructor("green", 36);
		System.out.println(y.getBorderWidth());
		System.out.println(y.getColour());
		
	}

}
