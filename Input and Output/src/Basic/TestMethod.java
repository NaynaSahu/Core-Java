package Basic;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Date;

public class TestMethod {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("c:/Activity/shadi bend baja barat.txt");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			System.out.println(new Date(f.lastModified()));
			System.out.println(f.length()+" "+"in bytes");
			
			
		}
		
		
	}

}
