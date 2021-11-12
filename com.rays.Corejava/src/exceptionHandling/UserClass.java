package exceptionHandling;

public class UserClass {
	public static void main(String[] args) throws LoginExcepton {
		LoginExcepton y = new LoginExcepton();
		int i = 7 ;
		if(i<10) 
			throw y;
			

	}

}
