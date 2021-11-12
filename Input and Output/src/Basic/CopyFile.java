package Basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		   FileReader fr = new FileReader("c:/Activity/shadi bend baja barat.txt");
		   FileWriter fw = new FileWriter("c:/Activity/Copy.txt");
		   
		   int ch = fr.read();
		   
		   while(ch!=-1) {
			   fw.write(ch);
			   ch = fr.read();
			   
			   
		   }
		   
		   fr.close();
		   fw.close();
		   System.out.println(fr+"is coppied to"+fw);
	}
	

}
