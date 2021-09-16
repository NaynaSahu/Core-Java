 package collection_Framework;


import java.util.ArrayList;
import java.util.Collection;

public class Test_Collection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("bura mat dekho");
		c.add("bura mat bolo");
		c.add("bura mat suno");
		System.out.println(c.size());
		for (Object ob : c) {
			System.out.print(ob);
		}
		// convert collection to array
		Object[] x = c.toArray();
		for (Object ob : x) {
			String s = (String) ob;
			System.out.println(s);

		}
	}

}
