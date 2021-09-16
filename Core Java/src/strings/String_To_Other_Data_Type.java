package strings;

public class String_To_Other_Data_Type {
	public static void main(String[] args) {
		// parsing is used

		String Ist = "5";
		String Dst = "5.5";
		String Fst = "55";
		String Lst = "45";
		String Bst = "true";
		int i = Integer.parseInt(Ist);
		double j = Double.parseDouble(Dst);
		float o = Float.parseFloat(Fst);
		long p = Long.parseLong(Lst);
		boolean b = Boolean.parseBoolean(Bst);
		System.out.println(j + o);
       StringBuffer x = new StringBuffer();
       
	}

}
