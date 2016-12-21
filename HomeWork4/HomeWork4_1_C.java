package HomeWork4;

import java.util.Scanner;

enum HTTPError {
	BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, METHOD_NOT_ALLOWED, NOT_ACCEPTABLE,
	PROXY_AUTHENTICATION_REQUIRED, REQUEST_TIMEOUT, CONFLICT, GONE  
}
public class HomeWork4_1_C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of HTTP Error from 400 to 410");
		int httperr = s.nextInt();
		
		switch (httperr) {
		case 400: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.BAD_REQUEST);
			break;
		case 401: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.UNAUTHORIZED);
			break;
		case 402: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.PAYMENT_REQUIRED);
			break;
		case 403: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.FORBIDDEN);
			break;
		case 404: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.NOT_FOUND);
			break;
		case 405: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.METHOD_NOT_ALLOWED);
			break;
		case 406: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.NOT_ACCEPTABLE);
			break;
		case 407: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.PROXY_AUTHENTICATION_REQUIRED);
			break;
		case 408: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.REQUEST_TIMEOUT);
			break;
		case 409: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.CONFLICT);
			break;
		case 410: 
			System.out.println("Name of " + httperr + " HTTP Error is: " + HTTPError.GONE);
			break;
		default: 
			System.out.println("I don't know this HTTP Error");
		}
		s.close();
	}

}
