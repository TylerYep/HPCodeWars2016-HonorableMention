import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class prob10 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(new File("prob10.txt"));
			while(s.hasNext()) { //while there are still words in the file
				int row,col,index=0;
				char[][] board = new char[3][3];
				String letters = s.next();
				
				//fill in the board
				for(row = 0; row < board.length; row++) {
					for(col = 0; col < board[row].length; col++,index++) {
						board[row][col] = letters.charAt(index);
					}
				}
				
				//check if someone won via across 
				for(row=0,col=0; col < board[row].length; col++) {
					
				}
				
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
