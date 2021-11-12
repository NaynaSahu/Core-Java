package basic_Java;

public class Employee extends Person {
	private String designation;

	public Employee() {
		System.out.println("default emp");
	}

	public Employee(String fn, String ln) {
		super(fn ,ln);
		System.out.println("2 para emp" + " " + fn + ln);
	}

	public Employee(String fn, String ln, String des) {
		System.out.println("3 para emp" + " " + fn + ln + " " + des);
	}
	public static void main(String[] args) {
		Employee y = new Employee("nayna" , "sahu");
	}

}
