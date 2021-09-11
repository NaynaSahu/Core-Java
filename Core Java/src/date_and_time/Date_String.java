package date_and_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_String {
	public static void main(String[] args) throws ParseException {
		Date n = new Date();
		System.out.println(n);
		
		SimpleDateFormat q = new SimpleDateFormat("dd/MM/yyyy");
		String st = q.format(n); // Date -> String
		System.out.println("Date : " + st );
		
		String date = "01/07/2003";
		Date d = q.parse(date);  // Date -> String
		System.out.println(d);
	}

}
