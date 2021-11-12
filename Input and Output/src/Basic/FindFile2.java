package Basic;

import java.io.File;

public class FindFile2 {
	public static void main(String[] args) {
		File f = new File("c:/Activity");
		File[] list = f.listFiles();
		for (File file : list) {
			if(file.isFile()) {
			System.out.println(file.getName());
			}
		}
	}
	

}
