package Exercise;

import java.util.Comparator;

public class OrderByLnameAndFname implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getLname().equals(o2.getLname())) {
			return (o1.getFname().compareTo(o2.getFname()));
		} else {
			return (o1.getLname().compareTo(o2.getLname()));

		}
	}

}
