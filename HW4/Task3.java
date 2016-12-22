package homeworks.day5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int mas[];
	mas = new int[5];
	boolean t = false;
	System.out.println("Enter 5 int numbers");
	for (int i = 0; i < 5; i++) {
	    mas[i] = sc.nextInt();
	}
	for (int i = 0; i < 5; i++) {
	    if (mas[i] > 0) {
		for (int n = i + 1; n < 5; n++) {
		    if (mas[n] > 0) {
			System.out.println("The second positive number is on " + ++n + " position" );
			t = true;
			break;
		    } else {
			continue;
		    }
		}
	    } else {
		continue;
	    }
	    break;
	}
	if (t == false) {
	    System.out.println("There are not second positive number");
	}

	int min = mas[0];
	int imin = 0;
	for (int i = 0; i < 5; i++) {
	    if (mas[i] < min) {
		min = mas[i];
		imin = i;
	    }

	}
	System.out.print("Minimum = " + min);
	System.out.println(" is in " + (imin + 1) + " place");

    }
}
