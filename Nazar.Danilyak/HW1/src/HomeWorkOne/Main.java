package HomeWorkOne;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("HW1.1: [1]");
		System.out.println("HW1.2: [2]");
		System.out.println("HW1.3: [3] ");
		switch (cs.nextInt()) {
		case 1:
			homeWorkOne(cs);
			break;
		case 2:
			homeWorkTwo(cs);
			break;
			
		case 3:
			homeWorkThree(cs);
			break;

		default:
			break;
		}
	}

	public static void homeWorkOne(Scanner cs) {

		int radius = cs.nextInt();
		double Pi = 3.14;
		System.out.println("S kola: [ " + Pi * radius * radius + " ]");
	}

	public static void homeWorkTwo(Scanner cs) {
		System.out.println("What is your name?");
		String name=cs.next();
		System.out.println( "Where are you live,"+ (name)+"?");
		String address = cs.next();
		System.out.println("all: [ name: "+name+" address: "+address+" ]");
	}
	public static void homeWorkThree(Scanner cs){
		System.out.println("c1: ");
		int c1=cs.nextInt();
		System.out.println("t1: ");
		int t1=cs.nextInt();
		System.out.println("User[1]: { "+c1*t1+" }");
		System.out.println("c2: ");
		int c2=cs.nextInt();
		System.out.println("t2: ");
		int t2=cs.nextInt();
		System.out.println("User[2]: { "+c2*t2+" }");
		System.out.println("c3: ");
		int c3=cs.nextInt();
		System.out.println("t3: ");
		int t3=cs.nextInt();
		System.out.println("User[3]: { "+c3*t3+" }");
		System.out.println("summUser: "+(c1*t1+c2*t2+c3*t3));
	
	}
}