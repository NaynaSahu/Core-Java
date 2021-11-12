package clonning;

public class ExTest {
	public static void main(String[] args) {
		ExDepartment y = new ExDepartment("developer");
		y.employee.name = "nayna";
		y.address.localAddress="bhopal";
		y.address.permanentAddress="indore";
		System.out.println(y.employee.name);
		System.out.println(y.address.localAddress);
		System.out.println(y.address.permanentAddress);
		System.out.println(y.depName);
		
	}

}
