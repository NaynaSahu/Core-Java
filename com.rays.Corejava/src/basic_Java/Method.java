package basic_Java;

public class Method {
	public int u ;//global variable
	public int y ;

	public void add() {
		System.out.println(u+y);
		
		
	}
	public static void main(String[] args) {
		Method m =new Method();
		m.u=6;
		m.y=7;
		m.add();
		
	}
}
