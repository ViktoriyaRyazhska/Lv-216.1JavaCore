import java.util.Scanner;

public class HomeWork1_2 {
	public static void main(String[] args) {
		
		System.out.println("What is your name?");
		Scanner s = new Scanner(System.in);
		
		String name = s.nextLine();
		
		System.out.println("Where are you live, " + name + " ?");
		String adress = s.nextLine();
		
		System.out.println(name + ", you live in " + adress + ".");
		
		s.close();
	}

}
