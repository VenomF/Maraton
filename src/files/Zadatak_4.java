package files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadatak_4 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Runner.readRunners();
		System.out.println("Prosjecno vrijeme potrebno da se zavrsi utrka je " + Runner.avgTime());

	}

}
