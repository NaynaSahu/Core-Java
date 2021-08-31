package javaBasics;

public class Sum_Of_Integers {
	public static void main(String[] args) {
		int x = 0;
		for (int i = 100; i < 200; i++) {
			if (i % 7 == 0) {
				x = x + i;

			}
		}
		System.out.println(x);

	}

}
