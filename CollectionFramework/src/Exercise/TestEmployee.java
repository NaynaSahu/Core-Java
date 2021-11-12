package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setFname("nayna");
		e1.setLname("sahu");
		e1.setSalary(78000);
		Employee e2 = new Employee();
		e2.setFname("ishika");
		e2.setLname("sahu");
		e2.setSalary(56895);
		Employee e3 = new Employee();
		e3.setFname("yashita");
		e3.setLname("sahu");
		e3.setSalary(35600);
		Employee e4 = new Employee();
		e4.setFname("tina");
		e4.setLname("sahu");
		e4.setSalary(65000);
		Employee e5 = new Employee();
		e5.setFname("abhay");
		e5.setLname("sahu");
		e5.setSalary(25555.65);
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		
		Collections.sort(e,new OrderBySalary());
		Iterator it = e.iterator();
		while (it.hasNext()) {
			Employee o = (Employee) it.next();
			System.out.println(o.getFname()+" "+o.getLname()+" "+o.getSalary());
			
		}
		
	}

}
