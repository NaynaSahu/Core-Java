package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee2 extends Employee {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setFname("Ramesh");
		e1.setLname("Pandey");
		e1.setSalary(30000);
		
		Employee e2 = new Employee();
		e2.setFname("Suresh");
		e2.setLname("Pandey");
		e2.setSalary(40000);
		
		Employee e3 = new Employee();
		e3.setFname("Haldi");
		e3.setLname("Ram");
		e3.setSalary(50000);
		
		Employee e4 = new Employee();
		e4.setFname("Nilesh");
		e4.setLname("Bachan");
		e4.setSalary(60000);
		
		Employee e5 = new Employee();
		e5.setFname("Amitabh");
		e5.setLname("Bachan");
		e5.setSalary(60000);
		
		Employee e6 = new Employee();
		e6.setFname("Baba");
		e6.setLname("Bachan");
		e6.setSalary(60000);
		
		Employee e7 = new Employee();
		e7.setFname("Nilesh");
		e7.setLname("Rai");
		e7.setSalary(60000);

		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		a.add(e6);
		a.add(e7);

		Collections.sort(a, new OrderByLnameAndFname());
		Iterator<Employee> it = a.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			System.out.println(emp.getFname() + " " + emp.getLname() + " " + emp.getSalary());

		}

	}

}
