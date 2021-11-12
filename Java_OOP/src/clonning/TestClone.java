package clonning;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		BankAccount y = new BankAccount(1000);
		Customer a = new Customer("nayna",y);
		
		Customer u = (Customer) a.clone();//type casting as clone is method of object class
		System.out.println(u.getName()+u.getBankAccount().getBalance());
	}

}
