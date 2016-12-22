package lesson1;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		// The flowers's bed
		int r;
		double perimeter;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the flower bed's radius");
		r = sc.nextInt();
		perimeter = 2 * Math.PI * r;
		area = 2 * Math.PI * r * r;
		System.out.println("The perimeter of the flower bed is " + perimeter);
		System.out.println("The area of the flower bed is " + area);
		
		// The name and address
		String name;
		String address;
		int age = 22;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		name = sc.nextLine();
		System.out.println("Where are you live, " + name + "?");
		address = sc.nextLine();
		System.out.println("Name - " + name + " Age - " + age + " Address - " + address);
		*/
		// The calls summary
		float c1;
		float c2;
		float c3;
		float t1;
		float t2;
		float t3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the c1 unit per minute");
		c1 = sc.nextFloat();
		System.out.println("Input the c2 unit per minute");
		c2 = sc.nextFloat();
		System.out.println("Input the c3 unit per minute");
		c3 = sc.nextFloat();
		System.out.println("Input the t1 time lengths of call");
		t1 = sc.nextFloat();
		System.out.println("Input the t2 time lengths of call");
		t2 = sc.nextFloat();
		System.out.println("Input the t3 time lengths of call");
		t3 = sc.nextFloat();
		System.out.println("The price of first call - " + (c1*t1));
		System.out.println("The price of second call - " + (c2*t2));
		System.out.println("The price of third call - " + (c3*t3));
		System.out.println("Total price - " + (c1*t1 + c2*t2 + c3*t3));
		

	}

}
