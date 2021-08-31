package javaBasics;

public class Harmonic_Series {
	public static void main(String[] args) {
		int x = 5;
		double z=0 , y = 0;
		for (int i = 1; i <= x; i++) {

			z = z+(double)1/i;
			System.out.println();

			System.out.print(z);
			y=y+z;

		}System.out.println(y);

	}

}
