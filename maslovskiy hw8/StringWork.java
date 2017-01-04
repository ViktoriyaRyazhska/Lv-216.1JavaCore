package homework8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWork {

	public static void main(java.lang.String[] args) {
		Scanner scn = new Scanner(System.in);
		task1(scn);
		task2();
		task3(scn);
	}

	private static void task3(Scanner scn) {
	//making pattern for US currency, input five examples, checking if they match
		int i =0;
		while(i<6){
		System.out.println("Input value ");
		String text = scn.nextLine();
		Pattern p = Pattern.compile("^\\$\\d*\\.\\d{2}");
		Matcher m = p.matcher(text);
		System.out.println(text + " "+ m.matches());
		i++;
		}
	}

	private static void task2() {
		String a = " ";
		String sentence = "I         am     learning       Java  Core";
		while(sentence.contains("  ")){
			String replace = sentence.replace("  ",a);
			sentence = replace;
		}
		System.out.println(sentence);
	}

	private static void task1(Scanner scn) {
		
//	entering the sentence	
		
		System.out.println("Input sentence of five words ");
		String sentence = scn.nextLine();
		String [] stc = sentence.split(" ");
		
/*	looking for a longest word in the sentence
		and determine the number of its letters*/
		
		int longest = stc[0].length();
		int index = 0;
		for(int i = 0; i<stc.length;i++){
			
			if(stc[i].length()>longest){
				longest = stc[i].length();
				index = i;
			}
		}
		System.out.println("The longest word is : " + stc[index]);
		System.out.println("The length of it is : " + longest);
		
//	looking for the second word in reverse order
		int ind = 0;
		for(int i = stc.length-1; i>=0;i--){
			if(ind==1){
				System.out.println("The second word in reverse order is :" + stc[i]);
				break;
			}
			ind++;
		}
	}

}
