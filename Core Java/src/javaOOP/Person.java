package javaOOP;

import java.util.Date;

public class Person {
	private String fname;
	private String lname;
	private String adress;

	public Person() {
		System.out.println("Default");
	}

	public Person(String fn, String ln) {

		fname = fn;
		lname = ln;
		System.out.println("2 param.." + fname + " " + lname);

	}

	public Person(String fn, String ln, String adress) {
		this(fn, ln);
		this.adress = adress;
		System.out.println("3 prama.. " + fname + " " + lname + " " + adress);
	}

	public static void main(String[] args) {
		Person n = new Person("nayna", "sahu", "ratan bagh");
	}
}
