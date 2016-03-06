import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class prob13 {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("prob13.txt"));
			int numStars = in.nextInt(); 
			for(int i = 0; i < numStars; i++) { //while there are still words in the file
				
				String name = in.next();
				double RAhrs = in.nextDouble();
				double RAmin = in.nextDouble();
				double decDeg = in.nextDouble();
				double decMin = in.nextDouble();
				String classification = in.next();
				double magn = in.nextDouble();
				double lyrs = in.nextDouble();
				
				double RA = 0, dec = 0;
				RA = (RAhrs * 15) + (RAmin * 0.25);
				if (decDeg >= 0) {
					dec = decDeg + (decMin / 60.0);
				} else if (decDeg < 0) {
					dec = decDeg - (decMin / 60.0);
				}
				double r = lyrs;
				double theta = (90 - dec) * Math.PI / 180.0;
				double phi = RA * Math.PI / 180.0;
				
				double xintercept = r * Math.sin(theta) * Math.cos(phi);
				double yintercept = r * Math.sin(theta) * Math.sin(phi);
				double zintercept = r * Math.cos(theta);
				System.out.print(name + " x=");
				System.out.printf("%.2f", xintercept);
				System.out.print(", y=");
				System.out.printf("%.2f", yintercept);
				System.out.print(", z=");
				System.out.printf("%.2f", zintercept);
				System.out.println();
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
