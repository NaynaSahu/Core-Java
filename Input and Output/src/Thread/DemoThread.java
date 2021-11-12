package Thread;

public class DemoThread extends Thread {
	private String name ;
	
	public DemoThread(String name) {
	this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+" "+name);
			
		}
	}
	public static void main(String[] args) {
		DemoThread d1 = new DemoThread("kabhi naram");
		DemoThread d2 = new DemoThread("kabhi garam");
		d1.start();
		d2.start();
		
	}

}
