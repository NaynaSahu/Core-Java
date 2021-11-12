package Basic;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineRead {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/Activity/shadi bend baja barat.txt");
		BufferedReader bf = new BufferedReader(fr);

		String line = bf.readLine();

		while (line != null) {
			System.out.println(line);
			line = bf.readLine();

		}
		fr.close();
		bf.close();
		

	}

}
