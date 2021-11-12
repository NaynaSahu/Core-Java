package Basic;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(12);
		l.add(2);
		l.add(45);
		l.add(56);
		System.out.println(l);
		l.add(1, " added at 1"); // will add at that position
		System.out.println("added at 1"+l);
		System.out.println("get value at 0"+"\n"+l.get(1));// will get the object 
		l.remove(0);
		System.out.println("removed at 0"+l);
		l.set(2, "added again by set");
		System.out.println("by using set"+l);
		
	}
	

}
