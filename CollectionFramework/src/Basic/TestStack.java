package Basic;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack x = new Stack();
		x.push('A');
		x.push('B');
		x.push('C');
		x.push('D');
		x.push('E');
		x.push('F');
		x.push('G');
		x.push('H');
		x.push('I');
		x.push('J');
		x.push('K');
		/*
		 * for(Object i = x.capacity() ; i ) Object o = x.pop(); System.out.println(x);
		 */	
		
		Stack y = new Stack();
		y.addAll(x);
		
	}

}
