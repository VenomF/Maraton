package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_7 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("imena.txt");
		Scanner reader = new Scanner(file);
		ArrayList<String> names = new ArrayList<String>();
		
		while (reader.hasNext())
		    names.add(reader.next());
		
		reader.close();
		Collections.sort(names);
		
		for (int i = 0; i < names.size(); i++)
		    System.out.println(names.get(i));
	}

}
