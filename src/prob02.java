import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob02 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("prob02.txt"));
			while(s.hasNextInt()) {
				int weeklyRate = s.nextInt();
				if(weeklyRate == 0) {
					
				}
				else {
					System.out.println(weeklyRate + " gallons per week will last " + 10000 / weeklyRate + " weeks");
				}
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
