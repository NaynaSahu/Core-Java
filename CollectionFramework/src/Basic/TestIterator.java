package Basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("ishika");
		c.add("nayna");
		c.add("yashita");
		c.add("tina");
		c.add("abhay");
		c.add("ishika");
		c.add("lucky");
		
		/*Iterator it = c.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			System.out.println(o);
			*/
			
			System.out.println("------remove--------");
			Iterator i = c.iterator();
			if(i.hasNext()) {
				Object o = (Object) i.next();
				i.remove();//remove next element
				System.out.println(o);
				
			}
			
			
			
			
		}
		
	}


