package HomeWork8;

import java.util.Scanner;

public class SentenceOfFiveWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sentence of five words");
		String str = s.nextLine();
		
		String[] arr = str.split(" ");
		int maxWord = arr[0].length();
		int indMaxWord = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > maxWord) {
				maxWord = arr[i].length();
				indMaxWord = i;
			}
			
		}
		
		System.out.println("The longest word: " + arr[indMaxWord]);
		System.out.println("The number of its leters: " + maxWord);
		StringBuilder strBild = new StringBuilder(arr[1]);
		System.out.println("The second word in revers order: " + strBild.reverse());
		s.close();
	}

}
