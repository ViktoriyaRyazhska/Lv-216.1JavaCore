package HomeWork8;

import java.util.Scanner;

public class SentenceOfManySpases {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sentence");
		String str = s.nextLine();
		str = str.trim();
		int countSpace = 0;
		StringBuilder strBild = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char nextCh = str.charAt(i);
			if (nextCh == ' '){
				countSpace++;
			}
			else {
				countSpace = 0;
			}
			if (countSpace <= 1){
				strBild.append(nextCh);
			}
		}
		
		System.out.println("New sentence: " + strBild);
		s.close();
	}

}
