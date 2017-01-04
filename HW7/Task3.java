package homeworks.day8;

import java.util.Scanner;
import java.util.regex.*;

public class Task3 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] str = new String[5];
	for (int i = 0; i < 5; i++) {
	    str[i] = sc.nextLine();
	}
	String pattern = "^\\$[0-9]+\\.[0-9]{2}$";
	Pattern p = Pattern.compile(pattern);
	for (int i = 0; i < 5; i++) {
	    Matcher m = p.matcher(str[i]);
	    if (m.matches()) {
		System.out.println("US currency " + str[i]);
		m.reset();
	    }
	}
    }

}
