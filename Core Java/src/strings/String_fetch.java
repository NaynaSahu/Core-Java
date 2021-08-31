package strings;

public class String_fetch {
	public static void main(String[] args) {
		String x = "nayna sahu"; // -> String literal pool
		String y = new String("Ronaldo");// -> heap area memory
		System.out.println(x);
		System.out.println(y);
	}
}
