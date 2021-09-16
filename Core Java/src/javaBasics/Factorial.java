package javaBasics;

public class Factorial {
	public static void main(String[] args) {

		int enternum = 5;
		int y = enternum ;
		for (int i = 1; i < enternum; i++) {
			y = y * i;
		}
		System.out.println(y);

	}

}
