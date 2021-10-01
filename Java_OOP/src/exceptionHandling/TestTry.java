package exceptionHandling;

public class TestTry {
	public static void main(String[] args) {
		try {
			int y = 15 / 0;
			
			String i = "nayna";
			System.out.println(y);
			System.out.println(i.charAt(5));

		} catch (ArithmeticException e) {// runtime exception
			System.out.println("is divided by zero4");
			try {
				String u = null;
				System.out.println(u.length());
				
			} catch (NullPointerException | IndexOutOfBoundsException y) {
				System.out.println("khali hai");
				System.out.println("choti hai");

			} catch (RuntimeException r) {
				System.out.println("baap");

			} catch (Exception t) {
				System.out.println("bada baap");

			}

		}

	}
}
