package ua.bilas3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String fileName = "mytext.txt";
		
		List<String> list = new LinkedList<>();
		
		String text = null;
		int count = 0;
//		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
//			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(new FileReader(fileName));
			System.out.println("read data from file: " + fileName);
	
			while ((text = bufferedReader.readLine()) != null) {
				list.add(text);
				System.out.println("row " + ++count + " read: " + text);
			} 
			
			
			
			System.out.println();
			System.out.println("count of lines  is " + count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println();
		
		
		int lineCounter = 1;
		for (String string : list) {
			System.out.println("numbers of symbols in line " + lineCounter++ + " is " + string.length());
		}
		
		int max = list.get(0).length();
		int min = list.get(0).length();
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() > max) {
				max = list.get(i).length();
						
			}
			if (list.get(i).length() < min) {
				min = list.get(i).length();
			}
		}
		
		System.out.println();
		System.out.println("max line length is " + max);
		System.out.println("min line length is " + min);
		System.out.println();
		

		String regex = "Lorem";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		for (String string : list) {
			matcher = pattern.matcher(string);
			if (matcher.find()) {
				System.out.println(string);
			}
		}
		
		try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
