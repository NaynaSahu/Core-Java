package clonning;

public class DeepBankAccount implements Cloneable{
	public double balance = 0;

	public DeepBankAccount() {

	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	

	public DeepBankAccount(double b) {
		balance = b;

	}


}
