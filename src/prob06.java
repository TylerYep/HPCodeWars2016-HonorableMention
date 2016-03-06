import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob06 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("prob06.txt"));
			s.next(); //skip the first line of the file
			while(s.hasNext()) { //while there are still words in the file
				
				double currentTemp = s.nextDouble();
				double temp0 = s.nextDouble();
				double temp1 = s.nextDouble();
				double celsius0 = s.nextDouble() / 8;
				double celsius1 = s.nextDouble() / 8;
				
				double slope = (double) (temp1 - temp0) / (celsius1 - celsius0);
				double yintercept = temp1 - (slope * celsius1);
				
				System.out.println((currentTemp - yintercept)/slope);
				
				
				
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
