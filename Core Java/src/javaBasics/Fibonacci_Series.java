package javaBasics;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int y = 0;
		int x = 1;
		
		System.out.print(y + x);
		for (int i = 0; i <= 5; i++) {
		int z= x + y ;
            System.out.print(z);
            y = x;
            x=z;
			
			
		}
	}

}
