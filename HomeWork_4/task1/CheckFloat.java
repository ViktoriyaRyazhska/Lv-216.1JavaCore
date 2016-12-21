package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckFloat {

	

	public void audit(float fl) {
	
		if (-5 <= fl && fl <= 5) {
			System.out.println("The  variable " + fl + " belong to the range [-5,5]");
		} else {
			System.out.println("The  variable " + fl + " does not belong to the range [-5,5]");
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		CheckFloat checkFloat = new CheckFloat();
		System.out.println("Enter 3 numbers");
		System.out.println("enter the first  number");
		float f1 = Float.parseFloat(br.readLine());
		checkFloat.audit(f1);
		System.out.println("enter the second   number");
		float f2 = Float.parseFloat(br.readLine());
		checkFloat.audit(f2);
		System.out.println("enter the third  number");
		float f3= Float.parseFloat(br.readLine());
		checkFloat.audit(f3);
		System.out.println("The end");

	}
}
