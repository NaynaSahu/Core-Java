package strings;

public class Revision_Test {
	public static void main(String[] args) {
		// 1

		String name = "Vijay";
		String surename = "Chauhan";
		System.out.println(name + " " + surename);

		String q = name.concat(surename);
		System.out.println(q);

		// 2
		String w = "Vijay Chauhan";
		String[] e = w.split(" ");
		System.out.println(e[e.length - 1]);

		// 3
		String r = "Nayna Sahu";
		int count = 0;
		for (int i = 0; i < r.length(); i++) {
			if (r.charAt(i) == 'a') {
				count += 1;
			}
		}
		System.out.println(count);

		// 4 String t = "print me"; System.out.println(t);

		// extra 5
		String u = "nayna sahu";
		for (int i = u.length() - 1; i >= 0; i--) {
			System.out.print(u.charAt(i));
		}

		// extra 6
		String i = "Nayna Sahu";
		String[] o = i.split(" ");
		for (String st : o) {
			for (int p = st.length() - 1; p >= 0; p--) {
				System.out.print(st.charAt(p));

			}
			System.out.print(" ");

		}
		
		//String buffer

	}

}
