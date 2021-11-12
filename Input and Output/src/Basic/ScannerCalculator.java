package Basic;

import java.util.Scanner;

public class ScannerCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1st no. = ");
		int a = sc.nextInt();
		System.out.println("input 2st no. = ");
		int b = sc.nextInt();
		System.out.println("choose your option -");
		System.out.println("ADD - a");
		System.out.println("Subtract - b");
		System.out.println("Multiply - c");
		System.out.println("Divide - d");
		System.out.println("write what you want to perform(a,b,c,d) -");
		String n = sc.next();
		
		switch (n) {
		case "a":
			int c = a+b;
			System.out.println("Ans= "+ c);

			break;
		case "b":
			int r = a-b;
			System.out.println("Ans= "+r);

			break;
		case "c":
			int k = a*b;
			System.out.println("Ans= "+k);

			break;

		case "d":
			double t = a/b;
			System.out.println("Ans= "+t);

			break;


		default:
			
			break;
		}
	}

}
