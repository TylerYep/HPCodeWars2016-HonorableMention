import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob03 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("prob03.txt"));
			s.next(); //skip the first line of the file
			while(s.hasNext()) { //while there are still words in the file
				boolean likes = false; //does she like the word or not?
				String word = s.next();
				for(int i = 0; i < word.length() - 1; i++) {
					if(word.charAt(i) == word.charAt(i + 1)) {
						likes = true;
					}	
				}
				if(likes) {
					System.out.println("likes " + word);
				}
				else {
					System.out.println("hates " + word);
				}
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
