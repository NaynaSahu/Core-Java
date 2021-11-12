package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setRollNo("2");
		m1.setFname("Aman");
		m1.setLname("Singh");
		m1.setPhy(56);
		m1.setChem(49);
		m1.setMath(55);

		Marksheet m2 = new Marksheet();
		m2.setRollNo("5");
		m2.setFname("Ajay");
		m2.setLname("Verma");
		m2.setPhy(67);
		m2.setChem(62);
		m2.setMath(70);

		Marksheet m3 = new Marksheet();
		m3.setRollNo("1");
		m3.setFname("Geet");
		m3.setLname("Singh");
		m3.setPhy(88);
		m3.setChem(93);
		m3.setMath(90);

		Marksheet m4 = new Marksheet();
		m4.setRollNo("3");
		m4.setFname("Ajay");
		m4.setLname("Roy");
		m4.setPhy(78);
		m4.setChem(69);
		m4.setMath(73);

		Marksheet m5 = new Marksheet();
		m5.setRollNo("4");
		m5.setFname("Ajay");
		m5.setLname("Sharma");
		m5.setPhy(92);
		m5.setChem(91);
		m5.setMath(94);

		ArrayList a = new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);		a.add(m4);
		a.add(m5);

		Collections.sort(a, new orderByfname());

		
	    Iterator it = a.iterator();
		while (it.hasNext()) {
			Marksheet Marksheet = (Marksheet) it.next();
			System.out.println(Marksheet.getRollNo() + " " + Marksheet.getFname() + " " + Marksheet.getLname() + " "
					+ Marksheet.getPhy() + " " + Marksheet.getChem() + " " + Marksheet.getMath());

		}

	}	

}
