package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {
	/*
	 * The user name can be 3 to 15 characters of the Latin alphabet, numbers,
	 * and underscores. Using regular expressions implement checking the user
	 * name for validity. Input five names in the main method . Output a message
	 * to the console of the validation of each of the entered names.
	 */

	public static void main(String[] args) {
		String pattern = "[a-zA-Z_]{3,5}";
		String[] names = { "Pavlo", "Iva_N", "Oleksandr", "igor", "_olya" };
		Pattern p = Pattern.compile(pattern);
		for (String name : names) {
			Matcher m = p.matcher(name);
			if (m.matches())
				System.out.printf("Name: %10s matches the pattern\n", name);
			else
				System.out.printf("Name: %10s don't matches the pattern\n", name);
		}

	}

}
