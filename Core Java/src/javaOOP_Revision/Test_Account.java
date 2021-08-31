package javaOOP_Revision;

public class Test_Account {
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
		
		
	
		
	}

}
