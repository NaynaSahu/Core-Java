package ExerciseOOP;

public class BusinessMan implements RichMan {

	public void donation() {
		System.out.println("donatedB");

	}

	public void party() {
		System.out.println("partyB");

	}

	public static void main(String[] args) {
		RichMan x = new BusinessMan();
		x.donation();
		x.party();

	}

}
