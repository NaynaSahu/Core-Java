package basic_Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_and_Time {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy");
		String date = y.format(d);
		System.out.println(date);
		
		String s = "01/07/2003";
		Date t = y.parse(s);
		System.out.println(s);
		
		
		
	}

}
