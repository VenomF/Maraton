package files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Zadatak_1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Runner.readRunners();
		Runner best=Runner.fastestTime();
		System.out.println("Najbrzi ucesnik je " + best.getName() + " sa vemenom " + best.getTime() + ".");

	}

}
