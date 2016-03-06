import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob04 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("prob04.txt"));
			while(s.hasNext()) { //while there are still words in the file
				double base = s.nextDouble();
				double power = s.nextDouble();
				double answer = base * Math.pow(10, power);
				if(base == 0) {
					
				}
				
				else {
					System.out.printf("%.2f",answer);
					System.out.println();
				}
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
