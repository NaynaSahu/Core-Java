package Basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	public static void main(String[] args) {
		Collection x = new ArrayList();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		System.out.println(x);
		System.out.println(x.contains(1));// contains
		System.out.println("--------Iterator----------");
		Iterator it = x.iterator();//iterator
		while (it.hasNext()) {
			Object t = (Object) it.next();
			System.out.println(t);
			
		}
		
		
		
		System.out.println("-------------------------------------------");
		Collection x1 = new ArrayList();
		x1.add(2);
		x1.add(3);
		x1.add(4);
		x1.addAll(x);//add all
		System.out.println(x1.containsAll(x));//Contains
		System.out.println(x1.retainAll(x));//retain
		x1.clear();// clear
		System.out.println(x1);
		
		
		
		
	}

}
