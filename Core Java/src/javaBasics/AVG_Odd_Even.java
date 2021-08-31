package javaBasics;

public class AVG_Odd_Even {
	public static void main(String[] args) {
		int x = 10;
		int y = 0 , k=0 , n;
		int z ;
		int t = x / 2;
		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				y = y + i;
			}else if (i%2!=0) {
				k=k+i;
				
			}
		}//even
		System.out.println(y);
		z=y/t;
		System.out.println(z);
		//odd
		System.out.println(k);
		n=k/t;
		System.out.println(n);
		
		 
	}

}
