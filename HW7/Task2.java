package homeworks.day8;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter words with spaces");
	String sentence = sc.nextLine();

	String doublespace = "  ";
	for (int i = 0; i < sentence.length(); i++) {
	    if (sentence.contains(doublespace)) {
		sentence = sentence.replace("  ", " ");

	    } else {
		break;
	    }
	}
	System.out.println(sentence);
    }
}
