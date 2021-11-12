package Sorting;

import java.util.Comparator;

public class orderByfname implements Comparator<Marksheet> {

	public int compare(Marksheet o1, Marksheet o2) {
		if (o1.getFname().equals(o2.getFname())) {
			return(o1.getLname().compareTo(o2.getLname()));
		} else {
			return(o1.getFname().compareTo(o2.getFname()));

		}
	}

}
