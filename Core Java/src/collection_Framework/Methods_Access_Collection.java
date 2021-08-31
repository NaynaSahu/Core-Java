package collection_Framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class Methods_Access_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(56);
		c.add("uodh");
		c.add(78);
		System.out.println(c);
		Vector t = new Vector();
		t.addAll(c);
		System.out.println(t);
		
	}

}
