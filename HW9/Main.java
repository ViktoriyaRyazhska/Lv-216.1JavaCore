package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println(div(5.5, 5.5));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("some error!");
		}
		
		try {
			for (int i = 0; i < 10; i++) {
				readNumber(1, 100);
			}

		} catch (NumberFormatException | IOException | MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("try to be thoughtful!");
	}
	
	public static double div(double a,double b) {
		return a / b;
	}
	
	public static int readNumber(int start, int end) throws NumberFormatException, IOException, MyException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("add number among " + start + " and " + end);
		int i = Integer.parseInt(bufferedReader.readLine());
		
		
		if (i >= start && i <= end)
			return i;
		else {
			throw new MyException("You added wrong number");
		}
	}
}
