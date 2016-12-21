package homeworks.day4;

import java.util.Scanner;

public class Numbers {
    public enum HTTPError {
	BadRequest, Unauthorized, Forbidden, PaymentRequired, NotFound, MethodNotAllowed, NotAcceptable, ProxyAuthenticationRequired
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 float numbers");
	float x1 = sc.nextFloat();
	float x2 = sc.nextFloat();
	float x3 = sc.nextFloat();
	if (x1 >= -5 && x1 <= 5 && x2 >= -5 && x2 <= 5 && x3 >= -5 && x3 <= 5) {
	    System.out.println("All numbers belong to [-5;5]");
	} else
	    System.out.println("Some numbers not belong to [-5;5]");
	System.out.println("Enter 3 integer numbers");
	int y1 = sc.nextInt();
	int y2 = sc.nextInt();
	int y3 = sc.nextInt();
	if (y1 > y2 && y1 > y3) {
	    System.out.println("Max number is " + y1);
	} else if (y2 > y1 && y2 > y3) {
	    System.out.println("Max number is " + y2);
	} else
	    System.out.println("Max number is " + y3);
	if (y1 < y2 && y1 < y3) {
	    System.out.println("Min number is " + y1);
	} else if (y2 < y1 && y2 < y3) {
	    System.out.println("Min number is " + y2);
	} else
	    System.out.println("Min number is " + y3);
	System.out.println("Write number of HTTP Error");
	HTTPError httperror;
	int http = sc.nextInt();
	switch (http) {
	case 400:
	    httperror = HTTPError.BadRequest;
	    System.out.println(httperror);
	    break;
	case 401:
	    httperror = HTTPError.Unauthorized;
	    System.out.println(httperror);
	    break;
	case 402:
	    httperror = HTTPError.Forbidden;
	    System.out.println(httperror);
	    break;
	case 403:
	    httperror = HTTPError.PaymentRequired;
	    System.out.println(httperror);
	    break;
	case 404:
	    httperror = HTTPError.NotFound;
	    System.out.println(httperror);
	    break;
	case 405:
	    httperror = HTTPError.MethodNotAllowed;
	    System.out.println(httperror);
	    break;
	case 406:
	    httperror = HTTPError.NotAcceptable;
	    System.out.println(httperror);
	    break;
	case 407:
	    httperror = HTTPError.ProxyAuthenticationRequired;
	    System.out.println(httperror);
	    break;
	default:
	    System.out.println("Unknown HTTP Error");
	    break;
	}
    }
}
