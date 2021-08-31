package javaBasics;

public class Prime_Num {
	public static void main(String[] args) {
		int x = 78;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				System.out.println("not prime");
				break ;

			} else {
				System.out.println("prime");
				break;
			}
		}
	}

}
