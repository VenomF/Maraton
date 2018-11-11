package files;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Zadatak_3 {

	public static void main(String[] args) throws IOException{
		File file=new File("maraton.txt");
		Scanner reader=new Scanner(file);
		Scanner input=new Scanner(System.in);
		System.out.print("Unesite ime: ");
		String name=input.next();
		input.close();
		
		while (reader.hasNext()) {
			if (reader.next().equals(name)) {
				System.out.println(reader.nextInt());
			}
		}
		
		reader.close();
	}

}
