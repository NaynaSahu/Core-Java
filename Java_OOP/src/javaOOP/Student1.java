package javaOOP;

public class Student1 {
	private String rollNo;
	private int marks;

	public Student1() {

	}

	public Student1(String rollNo, int marks) {
		this.marks = marks;
		this.rollNo = rollNo;
	}

	public String getRollNo() {
		return rollNo;
	}

	public int getMarks() {
		return marks;
	}

}
