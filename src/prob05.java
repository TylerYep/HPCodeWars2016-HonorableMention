import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob05 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("prob05.txt"));
			s.next(); //skip the first line of the file
			while(s.hasNext()) { //while there are still words in the file
				int n = s.nextInt();
				String originalWord = s.next();
				originalWord = originalWord.substring(1); //remove first char
				String output ="";
				int i = 0;
				while(originalWord.substring(i).length() >= n) {
					output += originalWord.substring(i, i + (n-1));
					i+=n;
				}
				
				output+=originalWord.substring(i);
				System.out.println(output + " " + output.length());
				
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
