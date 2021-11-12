package clonning;

public class ExAddress implements Cloneable {
	public String permanentAddress;
	public String localAddress;
	public ExAddress() {
	
	}
	public ExAddress(String pa ,String la ) {
		permanentAddress= pa;
		localAddress = la;
		
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

}
