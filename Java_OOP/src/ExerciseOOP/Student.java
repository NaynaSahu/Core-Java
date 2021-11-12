package ExerciseOOP;

public class Student implements RichMan {

	
	public void donation() {
		System.out.println("donatedS");
		
	}


	public void party() {
		System.out.println("partyS");
		
	}
	public static void main(String[] args) {
		RichMan x = new Student();
		x.donation();
		x.party();
	}

}
