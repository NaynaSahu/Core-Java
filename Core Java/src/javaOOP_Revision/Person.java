package javaOOP_Revision;

import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String address;
	public static final int AVG_AGE = 60;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge(int age) {
		return age ;
	}
	public static void main(String[] args) {
		Person x = new Person();
		System.out.println(x.AVG_AGE);
	}

}
