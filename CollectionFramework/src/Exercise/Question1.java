package Exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {
	public static void main(String[] args) {
		ArrayList<Object> m = new ArrayList<Object>();
		m.add("nayna");
		m.add("has");
		m.add("2");
		m.add("books");
		m.add(123);
		m.add(456);
		m.add(789);
		
		Iterator<Object> y= m.iterator();
		while (y.hasNext()) {
			Object o = (Object) y.next();
			System.out.println(o);
			
		}
		
		
	}
	
	

}
