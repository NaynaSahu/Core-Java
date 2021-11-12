package date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class Calculate_age {
	public static void main(String[] args)  {
		LocalDate	t = LocalDate.now(); //current time and date
		LocalDate	dob = LocalDate.of(2003 , 07 ,01);
		Period p = Period.between(t, dob);
		System.out.println(p);
		
	}
	

}
