package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("add first num:");
		float a = Float.parseFloat(bufferedReader.readLine());

		System.out.println("add second num:");
		float b = Float.parseFloat(bufferedReader.readLine());

		System.out.println("add third num:");
		float c = Float.parseFloat(bufferedReader.readLine());

		if ((a >= -5 || a <= 5) && (b >= -5 || b <= 5) && (c >= 5 || c <= 5)) {
			System.out.println("numbers " + a + ", " + b + " and " + c + " are all belong to the range [-5, 5]");
		} else {
			System.out.println("numbers " + a + ", " + b + " and " + c + " are not all belong to the range [-5, 5]");
		}

		
		
		System.out.println();

		
		
		System.out.println("add first int:");
		int x = Integer.parseInt(bufferedReader.readLine());

		System.out.println("add second int:");
		int y = Integer.parseInt(bufferedReader.readLine());

		System.out.println("add third int:");
		int z = Integer.parseInt(bufferedReader.readLine());

		max(x, y, z);
		min(x, y, z);
		
		
		
		
		
		int errorNum = Integer.parseInt(bufferedReader.readLine());
		
		switch (errorNum) {
		case 400:
			System.out.println(errorNum + " - " + HTTPError.BAD_REQUEST);
			break;
		case 401:
			System.out.println(errorNum + " - " + HTTPError.UNAUTORIZED_ERROR);
			break;
		case 402:
			System.out.println(errorNum + " - " + HTTPError.PAYMANT_REQUIRED);
			break;
		case 403:
			System.out.println(errorNum + " - " + HTTPError.FORBIDEN);
			break;
		case 404:
			System.out.println(errorNum + " - " + HTTPError.NOT_FOUND);
			break;
		case 405:
			System.out.println(errorNum + " - " + HTTPError.METHOD_NOT_ALLOWED);
			break;
		case 406:
			System.out.println(errorNum + " - " + HTTPError.NOT_ACCEPTABLE);
			break;
		case 407:
			System.out.println(errorNum + " - " + HTTPError.PROXY_AUTHENTICATION_REQUIRED);
			break;
		case 408:
			System.out.println(errorNum + " - " + HTTPError.REQUEST_TIMEOUT);
			break;
		case 409:
			System.out.println(errorNum + " - " + HTTPError.CONFLICT);
			break;
		case 410:
			System.out.println(errorNum + " - " + HTTPError.GONE);
			break;
		default:
			break;
		}
		
		
		Dog dog = new Dog("lord", Breed.BULLDOG, 3);
		Dog dog2 = new Dog("bax", Breed.STUFF, 4);
		Dog dog3 = new Dog();
		
		dog3.setName("buddy");
		dog3.setBreed(Breed.LABRADOR);
		dog3.setAge(6);
		
		if (dog.getAge() > dog2.getAge() && dog.getAge() > dog3.getAge()) {
			System.out.println("dog name: " + dog.getName());
			System.out.println("dog kind: " + dog.getBreed());
		} else {
			if (dog2.getAge() > dog.getAge() && dog2.getAge() > dog3.getAge()) {
				System.out.println("dog name: " + dog2.getName());
				System.out.println("dog kind: " + dog2.getBreed());
			} else {
				System.out.println("dog name: " + dog3.getName());
				System.out.println("dog kind: " + dog3.getBreed());
			}
		}
	}

	public static void max(int a, int b, int c) {
		System.out.print("maximum is - ");
		if (a > b && a > c) {
			System.out.println(a);
		} else {
			if (b > a && b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
	}
	
	public static void min(int a, int b, int c) {
		System.out.print("minimum is - ");
		if (a < b && a < c) {
			System.out.println(a);
		} else {
			if (b < a && b < c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		
		
	}
	
}
