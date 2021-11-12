package Basic;

import java.io.File;

public class FindAllFilesAndFolders {
	public static void main(String[] args) {
		File f = new File("c:/");
		
		String[] list = f.list();// will give all the files and folders 
		
		for (String st : list) {
			System.out.println(st);
			
		}
	}

}
