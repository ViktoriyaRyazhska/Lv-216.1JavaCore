package lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyText {
	/*
	 * Prepare mytext.txt file with a lot of text inside. Read context from file
	 * into array of strings. Each array item contains one line from file.
	 * Complete next tasks: 1) count and write the number of symbols in every
	 * line. 2) find the longest and the shortest line. 3) find and write only
	 * that lines, which consist of word «var»
	 */
	public static void main(String[] args) {

		String source = "mytext.txt";
		int count = 1;
		try {
			FileReader fr = new FileReader(source);
			BufferedReader br = new BufferedReader(fr);
			try {
				String str;
				String shortest = (new char[100]).toString();
				String longest = (new char[1]).toString();
				while ((str = br.readLine()) != null) {
					System.out.println("Line " + count + " has " + str.length() + " symbols");
					count++;
					if (str.contains(" var ") || str.contains(" var.") || str.contains(" Var ")
							|| str.contains("var ")) {
						System.out.println("\nThe string which consist of word «var»:\n" + str + "\n");
					}
					if (str.length() > longest.length()) {
						longest = str;
					}
					if (str.length() < shortest.length()) {
						shortest = str;
					}
				}
				System.out.println("\nThe shortest line:\n" + shortest + "\n");
				System.out.println("\nThe longest line:\n" + longest + "\n");
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
