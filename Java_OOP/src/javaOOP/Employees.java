package javaOOP;

public class Employees extends Person {

	private String designation;

	public Employees() {
		System.out.println("Default 2");
	}

	public Employees(String fn, String ln, String adress, String desi) {
		super(fn, ln, adress);
		designation = desi;
		System.out.println("4 prama" + fn + ln + adress + designation);

	}

	public static void main(String[] args) {
		Employees d = new Employees("rekha", "sharma", "indore", "developer");

	}

}
