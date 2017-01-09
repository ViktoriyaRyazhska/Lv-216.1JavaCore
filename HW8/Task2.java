package homeworks.day9;

import java.util.Scanner;

public class Task2 {

    public static int readNumber(int start, int end, int number) throws MyException1 {
	if (number < start || number > end) {
	    throw new MyException1(number + " is out of range");
	} else {
	    return number;
	}
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input the start and the end of the bound");
	try {
	    int start = Integer.parseInt(sc.nextLine());
	    int end = Integer.parseInt(sc.nextLine());
	    System.out.println("Enter 10 numbers");
	    for (int i = 0; i < 10; i++) {
		try {
		    System.out.println(readNumber(start, end, Integer.parseInt(sc.nextLine())));
		} catch (NumberFormatException e) {
		    System.err.println("Entered data is not a number");
		} catch (MyException1 e) {
		    System.err.println(e.getMessage());
		}
	    }
	} catch (NumberFormatException e) {
	    System.err.println("Entered data is not a number");
	}
    }
}
