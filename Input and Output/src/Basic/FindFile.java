package Basic;

import java.io.File;

public class FindFile {
	public static void main(String[] args) {
		File f = new File("c:/Activity");
		
		String[] file = f.list();
		for (String st : file) {
			File fa = new File("c:/Activity",st);
			if(fa.isFile()) {
				System.out.println(st);
				
			}
			
			
		}
		
		
	}

}
