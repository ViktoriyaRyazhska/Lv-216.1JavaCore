package Lesson4;

import java.util.Scanner;

enum HttpError {
	Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found
}

public class HomeWork_1c {

	public static void main(String[] args) {

		// read number of HTTP Error (400, 401,402, ...) and write the name of
		// this error (Declare enum HTTPError)
		Scanner sc = new Scanner(System.in);

		System.out.println("Type an HttpError");

		switch (sc.nextInt()) {
		case 400:
			System.out.println("400 " + HttpError.Bad_Request);
			break;
		case 401:
			System.out.println("401 " + HttpError.Unauthorized);
			break;
		case 402:
			System.out.println("402 " + HttpError.Payment_Required);
			break;
		case 403:
			System.out.println("403 " + HttpError.Forbidden);
			break;
		case 404:
			System.out.println("404 " + HttpError.Not_Found);
			break;
		default:
			System.out
					.println("Type an HttpError one of 400, 401, 402, 403, 404");
		}

	}

}
