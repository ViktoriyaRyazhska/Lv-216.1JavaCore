package ua.bilas3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

//		String fileName = "mytext.txt";
//		List<String> list = new LinkedList<>();
//		
//		for (int i = 0; i < 33; i++) {
//			list.add("one " + 1);
//		}
//
//		FileOutputStream fileOutputStream = null;
//
//		try {
//			fileOutputStream = new FileOutputStream(fileName);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				fileOutputStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//		System.out.println("file " + fileName + " was created");

		String fileName = "mytext.txt";
		
		List<String> list = new LinkedList<>();
		
		String text = null;
		int count = 0;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
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
		
		int size = list.size();
		
		String[] lines = new String[size];
		
		list.toArray(lines);
		
//		for (int i = 0; i < lines.length; i++) {
//			System.out.println(lines[i]);
//		}
		
		
		
		for (int i = 0; i < lines.length; i++) {
			System.out.println("number of symbols in line " + (i+1) + " is " + lines[i].length());
		}
		
		int max = lines[0].length();
		int min = lines[0].length();
		for (int i = 1; i < lines.length; i++) {
			if (lines[i].length() > max) {
				max = lines[i].length();
						
			}
			if (lines[i].length() < min) {
				min = lines[i].length();
			}
		}
		
		System.out.println();
		System.out.println("max line length is " + max);
		System.out.println("min line length is " + min);
		System.out.println();
		
		
		
		String regex = "Lorem";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher;
		for (int i = 0; i < lines.length; i++) {
			matcher = pattern.matcher(lines[i]);
			if (matcher.find()) {
				System.out.println(lines[i]);
			}
		}
		
	}
}
