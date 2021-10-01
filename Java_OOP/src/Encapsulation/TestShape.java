package Encapsulation;

public class TestShape {
	public static void main(String[] args) {
		Shape x = new Shape();
		x.setBorderWidth(78);
		x.setColour("red");
		System.out.println(x.getBorderWidth());
		System.out.println(x.getColour());
		

	}
}
