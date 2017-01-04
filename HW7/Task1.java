package homeworks.day8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 5 words");
	String sentence = sc.nextLine();

	String[] words = sentence.split(" ");

	int maxlength = words[0].length();
	int imax = 0;
	for (int i = 0; i < words.length; i++) {
	    if (words[i].length() > maxlength) {
		maxlength = words[i].length();
		imax = i;
	    }

	}
	
	System.out.println("The largest word is " + words[imax]);
	System.out.println("The number of its letters is " + maxlength);
	
	StringBuilder sb = new StringBuilder(words[1]);
	sb.reverse();
	
	System.out.println("The reverse of second word is " + sb);
    }
}
