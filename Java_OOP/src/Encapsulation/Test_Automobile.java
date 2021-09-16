package Encapsulation;

public class Test_Automobile {
	public static void main(String[] args) {
		Automobile x = new Automobile();
		x.acceleration(20);
		System.out.println(x.getSpeed());
		x.breakk(10);
		System.out.println(x.getSpeed());
		x.changeGear(1);
		System.out.println(Automobile.NO_OF_GEARS);// can also call this way  OR
		System.out.println(x.NO_OF_GEARS); // this way
	}

}
