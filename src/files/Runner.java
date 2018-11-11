package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner implements Comparable<Object> {
	
	private String name;
	private int time;
	public static ArrayList<Runner> runners=new ArrayList<>();
	private static File maratonci=new File("maraton.txt");
	
	
	public Runner(String name, int time) {
		this.name=name;
		this.time=time;
		runners.add(this);
	}
	
	public Runner(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public static void readRunners() throws IOException, FileNotFoundException {
		
			Scanner reader=new Scanner(maratonci);
			
			while(reader.hasNextLine()) {
				String name=reader.next();
				int time=reader.nextInt();
				new Runner(name, time);
			}
			
			reader.close();
	}
	
	public static Runner fastestTime() {
		sort();
		return runners.get(0);
	}
	
	public static int avgTime() {
		int totalTime=0;
		
		for(int i=0; i<runners.size(); i++)
			totalTime+=runners.get(i).time;
		
		return totalTime/runners.size();
	}
	 @Override
	    public int compareTo(Object compareRunner) {
	        int compareTime=((Runner)compareRunner).getTime();
	        return this.time-compareTime;
	    }

	    
	    public static void sort() {
		Collections.sort(runners);

	    }

}
