package files;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak_6 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.textfiles.com/science/astronau.txt");
		Scanner reader = new Scanner (url.openStream());
		int counter=0;
		while(reader.hasNext()) {
		    reader.nextLine();
		    counter++;
		}
		reader.close();
		System.out.println("Broj redova je: " + counter);

	}

}
