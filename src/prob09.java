import java.util.*;
public class prob09 {
	public static String painting(int x, int y, int z){
		int outerVolume = x*y*z;
		int innerVolume = (x-2)*(y-2)*(z-2);
		String perfectness = "";
		if (outerVolume-innerVolume > innerVolume){
			perfectness = "MORE than Perfect.";
		}
		else if (outerVolume-innerVolume == innerVolume){
			perfectness = "PERFECT.";
		}
		else{	
			perfectness = "LESS than Perfect.";
		}
		return perfectness;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			if (x!= 0 && y != 0 && z!= 0) {
				System.out.println("A "+ x + "x" + y + "x"+ z +" block is "+ painting(x,y,z));
			}			
		}
	}

}
