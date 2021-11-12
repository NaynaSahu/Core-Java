package clonning;

public class ExEmployee implements Cloneable{
	public String name;
	public ExAddress ad;
	public ExEmployee() {
	
	}
	public ExEmployee(String name) {
	this.name = name;
	ad = new ExAddress();
	
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	     ExEmployee y = (ExEmployee) super.clone();
	     y.ad = (ExAddress)ad.clone();
		return y;
	}

}
