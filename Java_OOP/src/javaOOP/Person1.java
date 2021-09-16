package javaOOP;

import java.util.Date;

public class Person1 {
	private String name;
	private Date dob;
	private String address;
	public static final int AVG_AGE = 60;

	public Person1() {
	}

	public Person1(String name, String address, Date dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

}
