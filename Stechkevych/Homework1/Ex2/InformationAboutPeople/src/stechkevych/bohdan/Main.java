package stechkevych.bohdan;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String address;
		System.out.println("What is your name?");
		name = sc.next();
		System.out.println("How old are you, "+name+"?");
		age = sc.nextInt();
		System.out.println("Where are you live, "+name+"?");
		address = sc.next();
		System.out.println("Your information,"+name+":");
		System.out.println("You have "+age+" years old.");
		System.out.println("You live: "+address+".");
		
			
	}
}
