package exceptionHandling;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	BalanceInsufficient e = new BalanceInsufficient();

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

	public void withdrawal(double x) throws BalanceInsufficient {

		if (getBalance() < x) {
			throw e;

		}
		double r = getBalance() - x;
		setBalance(r);

	}

	public void fundTranfer(double x) throws BalanceInsufficient {
		if (getBalance() < x) {
			throw e;

		}
		x = getBalance() - x;
		setBalance(x);
	}

	public void payBill(double x) throws BalanceInsufficient {
		if (getBalance() < x) {
			throw e;

		}
		x = getBalance() - x;
		setBalance(x);

	}

}
