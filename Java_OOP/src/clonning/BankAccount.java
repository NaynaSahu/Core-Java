package clonning;
// Shallow Cloning 
public class BankAccount {// 1st step
	public double balance = 0;

	public BankAccount() {

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(double b) {
		balance = b;

	}

	
	/*
	 * public static void main(String[] args) throws CloneNotSupportedException {
	 * BankAccount x = new BankAccount(100); BankAccount y
	 * =(BankAccount)x.clone();//type casting as the method is of type object
	 * //y.balance = 20; System.out.println(x.balance);
	 * System.out.println(y.balance); }
	 */
	

}
