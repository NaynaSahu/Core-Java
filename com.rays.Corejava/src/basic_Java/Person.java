package basic_Java;

public class Person {
	protected String fname;
	protected String lname;
	protected String adress;
	
	public Person() {
		
	}
	public Person(String f , String l) {
		
		fname= f;
		lname = l;
		System.out.println("2 parametrised person"+f+l);
	}
	public Person(String f , String l , String address) {
		this(f,l);
		adress = address;
		System.out.println("3 parametrised person" +f+l+address);
	}
	
	public static void main(String[] args) {
		Person p = new Person("nayna","sahu");
		
	}
	
	
	

}
