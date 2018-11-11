package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import files.Runner;

public class Zadatak_5 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Runner.readRunners();
		File bestRunners=new File("najboljiMaratonci.txt");
		if(bestRunners.exists()) {
			PrintWriter writer=new PrintWriter(bestRunners);
			for(int i=0; i<Runner.runners.size(); i++)
				if(Runner.runners.get(i).getTime()<=300) {
					writer.print(Runner.runners.get(i).getName()+ " ");
					writer.print(Runner.runners.get(i).getTime());
					writer.println();
					writer.flush();
				}
			writer.close();
			System.out.println("Imena ucesika koji su zavrsili za 300 minuta ili manje su uspjesno upisana u \"najboljiMaratonci.txt\".");
		}
	}

}
