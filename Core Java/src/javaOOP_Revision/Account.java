package javaOOP_Revision;

public class Account {
	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double x) {
		x = x + getBalance();
		setBalance(x);

	}

	public void withdrawal(double x) {
		double r = getBalance() - x;
		setBalance(r);

	}

	public void fundTranfer(double x) {
		x = getBalance() - x;
		setBalance(x);
	}

	public void payBill(double x) {
		x = getBalance() - x;
		setBalance(x);

	}

}
