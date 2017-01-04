package ua.bilas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		

		String pattern = "[IT academy]";
		String word = "academy";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(word);
		
		System.out.println(m.find());
		
		System.out.println();
//		------------------------------------------------------------
		
		String snm = "ivanov ivan ivanovich";
		
		String[] mass = snm.split(" ");
		
		System.out.println(mass[0] + " " + mass[1].charAt(0) + ". " + mass[2].charAt(0) + ".");
		
		System.out.println(mass[1]);
		
		System.out.println();
		
		for (int i = mass.length - 1; i >= 0; i--) {
			System.out.println(mass[i]);
		}
		System.out.println();
//		------------------------------------------------------------
		
		String pattern2 = "([a-zA-z0-9]){3,15}([\\_]){0,1}";
		
		String[] logins = new String[5];
		
		logins[0] = "i2_";
		logins[1] = "ivan123*";
		logins[2] = "123_ivan";
		logins[3] = " іван";
		logins[4] = "_ivan";
		
		Pattern p2 = Pattern.compile(pattern2);
		
		Matcher[] matchers = new Matcher[5];
		
		for (int i = 0; i < matchers.length; i++) {
			matchers[i] = p2.matcher(logins[i]);
		}
		
		for (int i = 0; i < matchers.length; i++) {
			if (matchers[i].find()) {
				System.out.println(logins[i]);
			} else {
				System.out.println("wrong login!");
			}
		}
		
		
	}
}
