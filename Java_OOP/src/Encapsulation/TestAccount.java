package Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account x = new Account() ;
		x.deposit(100);
		System.out.println(x.getBalance());
		x.withdrawal(50);
		System.out.println(x.getBalance());
		x.withdrawal(20);
		System.out.println(x.getBalance());
		x.withdrawal(35);
		System.out.println(x.getBalance());
		Account y = new Account();
		y.deposit(60);
		System.out.println(y.getBalance());
		
		
	
		
	}

}
