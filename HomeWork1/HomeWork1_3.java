import java.util.Scanner;

public class HomeWork1_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter standard units per minute for country c1");
		double c1 = s.nextDouble();
		System.out.println("Enter the number of minutes t1");
		int t1 = s.nextInt();
		
		System.out.println("Enter standard units per minute for country c2");
		double c2 = s.nextDouble();
		System.out.println("Enter the number of minutes t2");
		int t2 = s.nextInt();

		System.out.println("Enter standard units per minute for country c3");
		double c3 = s.nextDouble();
		System.out.println("Enter the number of minutes t3");
		int t3 = s.nextInt();
		
		System.out.println("Phone call from country c1 will count " + (c1 * t1));
		System.out.println("Phone call from country c2 will count " + (c2 * t2));
		System.out.println("Phone call from country c3 will count " + (c3 * t3));
		System.out.println("All talk together will count " + (c1 * t1 + c2 * t2 + c3 * t3));
		
		s.close();

	}

}
