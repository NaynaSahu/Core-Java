package strings;

public class Reverse_Words_Of_String {
	public static void main(String[] args) {
		String x = "nayna sahu is a student";
		String[] y = x.split(" ");
		for (String st : y) {
			for (int i = st.length()-1 ; i>=0 ; i--) {
				System.out.print(st.charAt(i));
				
			}System.out.print(" ");
			
		}
		
	}
	

}
