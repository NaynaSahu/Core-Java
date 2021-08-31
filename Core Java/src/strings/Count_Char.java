package strings;

public class Count_Char {
	public static void main(String[] args) {
		String x = "nayna sahu is a student";
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);

	}

}
