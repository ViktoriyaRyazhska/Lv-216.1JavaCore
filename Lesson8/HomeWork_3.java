package lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork_3 {
	/*
	 * Implement a pattern for US currency: the first symbol "$", then any
	 * number of digits, dot and two digits after the dot. Enter the text from
	 * the console that contains several occurrences of US currency. Display all
	 * occurrences on the screen.
	 */

	public static void main(String[] args) {
		String usdPattern = "[$][0-9]+[.][0-9]{2}";
		
		Pattern p = Pattern.compile(usdPattern);
		
		String text = "$22536.45, $125.15,   @#$$536.50, qqwwe34567$26.45,";
		
		Matcher m = p.matcher(text);
		
		while(m.find()){
			System.out.println(text.substring(m.start(), m.end()));
		}
		
	}

}
