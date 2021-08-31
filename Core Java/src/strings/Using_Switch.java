package strings;

public class Using_Switch {
	public static void main(String[] args) {
		// write a program to find vowels in the given String
		String name = "nayna sahu";
		int countv = 0;
		int countc = 0;
		String[] sp = name.split(" ");
		for (String st : sp) {
			for (int i = 0; i < name.length(); i++) {
				char y = name.charAt(i);
				switch (y) {
				case 'a':
					countv += 1;

					break;
				case 'e':
					countv += 1;

					break;
				case 'i':
					countv += 1;

					break;
				case 'o':
					countv += 1;

					break;
				case 'u':
					countv += 1;

					break;

				default:
					countc += 1;
					break;
				}
			}

		}
		System.out.println("No. of Vowels = " + countv);
		System.out.println("No. of Consonents = " + countc);
	}
}