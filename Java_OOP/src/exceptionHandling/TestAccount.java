package exceptionHandling;

public class TestAccount {
	public static void main(String[] args) throws BalanceInsufficient {
		Account a = new Account();
		System.out.println(a.getBalance());
		a.deposit(1000);
		System.out.println(a.getBalance());
		a.withdrawal(500);
		System.out.println(a.getBalance());
		a.withdrawal(1000);
		
		
		
		
	}

}
