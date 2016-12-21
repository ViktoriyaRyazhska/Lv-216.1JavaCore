package task1;

import java.io.IOException;
import java.util.Scanner;

public class HTTP {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose http error 400, 401, 402, 403");
		int e = sc.nextInt();

		HTTPErr httpErr;
		switch (e) {
		case 400:
			System.out.println(httpErr = HTTPErr.BAD_REQUEST);
			break;
		case 401:
			System.out.println(httpErr = HTTPErr.UNAUTHORIZED);
			break;
		case 402:
			System.out.println(httpErr = HTTPErr.PAYMENT_REQUIRED);
			break;
		case 403:
			System.out.println(httpErr = HTTPErr.FORBIDDEN);
			break;
		default :
			System.out.println("Err...");
		}

	}

}

enum HTTPErr {
	BAD_REQUEST, UNAUTHORIZED, FORBIDDEN, PAYMENT_REQUIRED
}