package clonning;

//Shallow Cloning 
public class Customer implements Cloneable {
	private String name;
	private BankAccount BankAccount;

	public Customer() {

	}

	public Customer(String name, BankAccount a) {
		this.BankAccount = a;
		this.name = name;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 Customer c = (Customer) super.clone();
		return c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getBankAccount() {
		return BankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		BankAccount = bankAccount;
	}

}
