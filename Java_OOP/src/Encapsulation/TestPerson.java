package Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person y = new Person();
		y.setAddress("ratan bagh");
		y.setName("Nayna Sahu");
		y.getAge(18);
		int X = y.AVG_AGE;

		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		String date = "01/07/2023";
		Date dob = d.parse(date);

		y.setDob(dob);
		System.out.println(y.getDob());

	}

}
