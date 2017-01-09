package HomeWork9;

import java.util.InputMismatchException;
import java.util.Scanner;

import Praktika9.MyExeption;

public class TestNumber {
	public static int readNumber(int start, int end) throws MyExeption{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int num = 0;
		try {
			num = s.nextInt();
			
		} catch (InputMismatchException e) {
			System.err.println("it not a number");
		}

		if ((num > start)&&(num < end)){
			return num;
		}
		else {
			throw new MyExeption("The number is not in range from " + start + " to " + end);
		}
		//s.close();
	}

	public static void main(String[] args) {
		int count = 10;
		for (int i = 0; i < count; i++) {
			try {
				System.out.println(readNumber(0, 100));
			} catch (MyExeption e) {
				// TODO Auto-generated catch block
				System.err.println("The number is not in the range");
			}
		}
	}

}
