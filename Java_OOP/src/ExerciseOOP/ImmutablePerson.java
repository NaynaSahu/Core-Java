package ExerciseOOP;

import java.util.Date;

public final class ImmutablePerson {

	private String name;
	private Date dob;
	private String address;
	private static final int AVG_AGE = 60;

	public ImmutablePerson (String name, Date dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
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

	public int getAge(int age) {
		return age;
	}

	public static void main(String[] args) {
		ImmutablePerson  x = new ImmutablePerson ("nayna", null, "ratan bagh");
		System.out.println(x.AVG_AGE);
	}

}
