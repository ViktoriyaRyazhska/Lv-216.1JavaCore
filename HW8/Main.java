package ua.bilas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("add 5 words text:");
		String text = bufferedReader.readLine();
		
		String[] strings = text.split(" ");
		
		int longestWordlength = strings[0].length();
		String longestWord = strings[0];
		
		for (int i = 1; i < strings.length; i++) {
			if (strings[i].length() > longestWordlength) {
				longestWordlength = strings[i].length();
				longestWord = strings[i];
			}
		}
		System.out.println("Longest word - " + longestWord);
		System.out.println("Length - " + longestWordlength);
		
		int count = 0;
		for (int i = strings.length - 1; i >= 0; i--) {
			count++;
			if (count == 2) {
				System.out.println(strings[i]);
				break;
			}
		}
	}
}
