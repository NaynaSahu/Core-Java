package javaBasics;

public class Array_2_D {
	public static void main(String[] args) {
		int[][] table = new int[11][11];//{ 1 2 3 4
		                                //  6 7 8 9 }
		for (int i = 2; i <=10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				
				table[i][j] = i * j;
				
				
				System.out.println(table[i][j]);
			
				// System.out.print();
			}System.out.println("\n");
		
		}

	}


}
