package Basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharRead {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/Activity/shadi bend baja barat.txt");
		int ch = fr.read();
		char chr;

		while (ch != -1) {
			chr = (char) ch;
			System.out.print(chr);
			ch = fr.read();

		}
		fr.close();

	}

}
