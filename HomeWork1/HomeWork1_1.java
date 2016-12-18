
import java.util.Scanner;

public class HomeWork1_1 {

	public static void main(String[] args) {
		
	System.out.println("Enter radius flower bed");
	Scanner s = new Scanner(System.in);
	double radius = s.nextDouble();
	
	double perimetr = 2 * Math.PI * radius;
	double area = Math.PI * Math.pow(radius, 2);
	
	System.out.println("Perimetr = " + perimetr);
	System.out.println("Area = " + area);
	
	s.close();
	
	}

}
