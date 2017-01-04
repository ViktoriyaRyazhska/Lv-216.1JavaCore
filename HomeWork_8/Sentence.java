package task1;

import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter sentence :");
		String inputString = s.nextLine();

		String[] stringArray = inputString.split(" ");
		int maxLenth = stringArray[0].length();
		int indexOfWord = 0;

		for (int i = 1; i < stringArray.length; i++) {
			if (stringArray[i].length() > maxLenth) {
				maxLenth = stringArray[i].length();
				indexOfWord = i;
			}

		}

		System.out.println("The longest word: " + stringArray[indexOfWord]);
		System.out.println("The number of  leters: " + maxLenth);
		System.out.println("Revers  second word ");
		StringBuilder stringBuilder = new StringBuilder(stringArray[1]);
		System.out.println("The second word in revers order: " + stringBuilder.reverse());
		s.close();
	}
}