package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("maraton.txt");
		Scanner reader = new Scanner(file);
		while (reader.hasNext()) {
			new Runner(reader.next(), reader.nextInt());
		}
		
		reader.close();
		Runner.sort();
		
		for (int i=0; i<Runner.runners.size(); i++) 
		    System.out.printf("%-10s%4d\n", Runner.runners.get(i).getName(), Runner.runners.get(i).getTime());
		
	}

}
