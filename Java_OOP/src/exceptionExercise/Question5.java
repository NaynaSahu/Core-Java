package exceptionExercise;

public class Question5 {
	public static void main(String[] args) {
		try {
			String name = "nayna";
			System.out.println("lenght" + name.length());
			System.out.println("char at" + name.charAt(7));

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String ki exception");

		} catch (IndexOutOfBoundsException | NullPointerException e) {
			System.out.println("index ki exception");
			System.out.println("null ki exception");

		}
	}

}
