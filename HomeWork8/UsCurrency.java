package HomeWork8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrency {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the text that contains several occurrences of US currency");
		//String str = s.nextLine();
		String str = "sfjkdfj $12313.12 jdhjkfhdk $123.131 hh $.32 $ 21321.23 $1.1";
		String patern = "\\${1}(\\d+)\\.\\d{2}";    
		Pattern p = Pattern.compile(patern);
		Matcher m = p.matcher(str);
		
		while (m.find()) {
			System.out.println(str.substring(m.start(), m.end()) + " ");
			
		}
		s.close();

	}

}
