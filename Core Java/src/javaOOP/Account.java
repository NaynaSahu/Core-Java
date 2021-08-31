package javaOOP;

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

	public void withdrawal(double amount) {
		double bal = getBalance();
		if (bal > 0) {
			bal = bal - amount;
			setBalance(bal);
		} else {
			System.err.print("insufficient balance");
		}
	}

	public void deposit(double amount) {
		double bal = getBalance();
		bal = bal + amount;
		setBalance(bal);
	}

	public void funTransfer(double amount) {
		double bal = getBalance();
		if (bal > 0) {
			bal = bal - amount;
			setBalance(bal);
		} else {
			System.err.println("insufficient balance");
		}

	}

	public void payBill(double amount) {
		double bal = getBalance();
		if (bal > 0) {
			bal = bal - amount;
			setBalance(bal);
		} else {
			System.err.println("insufficient balance");
		}

	}
}
