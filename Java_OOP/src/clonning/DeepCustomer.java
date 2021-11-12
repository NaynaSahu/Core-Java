package clonning;

public class DeepCustomer implements Cloneable {
	public String name;
	public DeepBankAccount account;

	public DeepCustomer() {

	}

	public DeepCustomer(String name ) {
		this.name = name;
		account = new DeepBankAccount(100);		

	}

	protected Object clone() throws CloneNotSupportedException {
         DeepCustomer c = (DeepCustomer) super.clone();
         c.account=(DeepBankAccount)account.clone();
         return c;
		
	}



}
