package clonning;

public class TestDeepClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		DeepCustomer c1 = new DeepCustomer("nayna");
		
		DeepCustomer c2 = (DeepCustomer)c1.clone();
		c2.name="balram";
		c2.account.balance=100;
		System.out.println("Original Object");
		System.out.println("name"+" "+":"+" "+c1.name);
		System.out.println("balance"+" "+":"+" "+c1.account.balance);
		System.out.println("-------");
		System.out.println("Cloned Object");
		System.out.println("name"+" "+":"+" "+c2.name);
		System.out.println("balance"+" "+":"+" "+c2.account.balance);
	}

}
