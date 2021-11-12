package Basic;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteInFile {
	public static void main(String[] args) throws Exception {
	//	File f = new File("c:/Activity/shadi bend baja barat.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("c:/Activity/shadi bend baja barat.txt",true));
		pw.println("indore");
		pw.close();
		System.out.println("Done");

	}

}
