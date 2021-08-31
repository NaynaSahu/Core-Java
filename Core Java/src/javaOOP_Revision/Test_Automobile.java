package javaOOP_Revision;

public class Test_Automobile {
	public static void main(String[] args) {
		Automobile x = new Automobile();
		x.acceleration(20);
		System.out.println(x.getSpeed());
		x.breakk(10);
		System.out.println(x.getSpeed());
		x.changeGear(1);
	}

}
