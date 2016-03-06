import java.util.*;
public class prob08 {
	public static void para(String str){
		for(int line = 0; line<str.length();line++){
			for (int spaces = 0; spaces<str.length()-line;spaces++){
				System.out.print(" ");
			}
			System.out.println(str.substring(0,line));
		}
		for(int z = 0; z<str.length();z++){
			System.out.println(str.substring(z));
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for(int l = 0; l < g; l++){
			String word = in.next();
			para(word);
		}

	}

}
