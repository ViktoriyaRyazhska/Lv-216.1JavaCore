package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_2 {
	/*
	 * Enter a sentence that contains the words between more than one space.
	 * Convert all spaces, consecutive, one. For example, if we introduce the
	 * sentence "I    am      learning     Java   Core», we have to get the "I'm
	 * learning Java Core»
	 */

	public static void main(String[] args) {
		String pattern = "[a-zA-Z]+";
		Pattern p = Pattern.compile(pattern);

		String string = new String("The  morning   sky    was                         grey");

		String[] strings = string.split(" ");

		for (int i = 0; i < strings.length; i++) {
			Matcher m = p.matcher(strings[i]);
			if (m.find()) {
				System.out.printf("%s", strings[i].substring(m.start(), m.end()));
				if (i < strings.length - 1) {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
}
