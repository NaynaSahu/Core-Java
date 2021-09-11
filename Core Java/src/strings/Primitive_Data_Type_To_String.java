package strings;

public class Primitive_Data_Type_To_String {
	public static void main(String[] args) {
		//OTHER DATA TYPES TO STRING
		int x = 45;
		String st = String.valueOf(x);
		System.out.println(st);
		String s = String.valueOf(5.5);
		String t = String.valueOf(true);
		String w = String.valueOf(5L);
		String y = String.valueOf(5.5D);
		System.out.println(st+s+t+w+y);
	}

}
