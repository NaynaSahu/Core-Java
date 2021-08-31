package date_and_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Revision_Date_And_Time {
	public static void main(String[] args) {
		Date d = new Date();
		Date e = new Date();
		System.out.println(d);
		System.out.println(d.getTime()); // return time in milliseconds since 1 jan 2021
		System.out.println(d.after(e));// compare 2 dates returns true if date object id > argument object i.e if d>e
		System.out.println(d.before(e));// returns true if date object is less than argument object
		d.setTime(145);
		SimpleDateFormat formate1 = new SimpleDateFormat("dd/mm/yyyy");
		String strdate = formate1.format(d);
		System.out.println(strdate);
	}

}
