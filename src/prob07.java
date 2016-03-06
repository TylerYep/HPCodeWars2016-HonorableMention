import java.util.*;
public class prob07 {
	
	public static int occurs(char letter, String y ){
		int occurs = 0;
		for(int l = 0; l < y.length(); l++){
			if (letter == y.charAt(l)){
				occurs++;
			}
		}
		return occurs;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for(int l = 0; l < g; l++){
			String x = in.next();
			String y = in.next();
			String z = in.next();
			String shortest;
			if (x.length()<y.length() && x.length()<z.length()){
				shortest = x;
			}
			else if (y.length()<x.length() && y.length()<z.length()){
				shortest = y;
			}
			else{
				shortest = z;
			}
			for(int letter = 0; letter<shortest.length(); letter++){
				if(!(occurs(shortest.charAt(letter), y)>0) || !(occurs(shortest.charAt(letter), z)>0) || !(occurs(shortest.charAt(letter), x)>0)){
					shortest = shortest.substring(0, letter)+shortest.substring(letter+1);
					letter--;
				}
			}
			//If 2+
			
			for(int letter = 0; letter<shortest.length(); letter++){
				if(occurs(shortest.charAt(letter),shortest)>occurs(shortest.charAt(letter),x) || occurs(shortest.charAt(letter),shortest)>occurs(shortest.charAt(letter),y) || occurs(shortest.charAt(letter),shortest)>occurs(shortest.charAt(letter),z)){
					shortest = shortest.substring(0, letter)+shortest.substring(letter+1);
				}
			}
			//Alphabetize
			
			for(int letter = 0; letter<shortest.length()-1; letter++){
				for(int index = letter+1; index<shortest.length(); index++){
					if (shortest.charAt(letter)<shortest.charAt(index)){
						shortest = shortest.substring(0,letter)+index+shortest.substring(letter+1,index)+letter+shortest.substring(index);
					}
				}
				
			}
			
			System.out.println(shortest);
		}

	}

}
