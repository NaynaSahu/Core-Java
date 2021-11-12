package clonning;

public class ExDepartment implements Cloneable{
	public String depName;
	public ExAddress address;
	public ExEmployee employee;
	public ExDepartment() {
	  
	}
	public ExDepartment(String dn) {
		depName = dn;
		address = new ExAddress();
		employee = new ExEmployee();
	
		  
	}@Override
	protected Object clone() throws CloneNotSupportedException {
		ExDepartment y = (ExDepartment)super.clone();
		y.address = (ExAddress) address.clone(); 
		y.employee =(ExEmployee) employee.clone();
		return y;
	}
	

}
