package homeworks.day9;

import java.util.Scanner;

public class Task1 {

    public static double div(double a, double b) throws ArithmeticException {
	if (b == 0) {
	    throw new ArithmeticException("Division by Zero");
	} else {
	    return a / b;
	}

    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	    double a = Double.parseDouble(sc.next());
	    double b = Double.parseDouble(sc.next());
	    System.out.println(div(a, b));
	} catch (NumberFormatException e) {
	    System.err.println("Input data is not a number");
	} catch (ArithmeticException e) {
	    System.err.println(e.getMessage());
	}
    }

}
