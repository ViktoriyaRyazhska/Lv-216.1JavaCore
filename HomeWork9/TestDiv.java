package HomeWork9;

import java.util.Scanner;

public class TestDiv {
	public static double div(double a, double b){
		return a / b;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input two double numbers");
		try {
			double num1 = Double.parseDouble(s.nextLine());
			double num2 = Double.parseDouble(s.nextLine());
			double divNum = div(num1, num2);
			System.out.println("Division num1 " + num1 + " to num2 " + num2 + " = " + divNum );
			
		} catch (NumberFormatException e) {
			System.out.println("Input number");

		}
		
		
		s.close();

	}

}
