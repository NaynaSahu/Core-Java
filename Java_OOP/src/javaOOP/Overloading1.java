package javaOOP;

public class Overloading1 {
	// can make more than one method with same name but diff parameter
	public int add(int i, int r) {
		return i + r;
	}

	public int add(int i, int r, int y) {// changing arguments
		return i + r + y;
	}

	public int add(int i, int r, double y) {//changing data type
		return i + r;
	}

	// CONSTRUCTOR OVERLOADING
	public Overloading1() {

	}

	public Overloading1(int i) {

	}

	public Overloading1(double i) {//changing data type

	}

	public Overloading1(int i, int y) {// changing arguments

	}

}
