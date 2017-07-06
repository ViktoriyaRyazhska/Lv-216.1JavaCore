package lesson10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork_4 {
	/*
	 * Create file1.txt file with a text about your career. Read context from
	 * file into array of strings. Each array item contains one line from file.
	 * Write in to the file2.txt: 
	 * 1) number of lines in file1.txt. 
	 * 2) the longest line in file1.txt. 
	 * 3) your name and birthday date.
	 */

	public static void main(String[] args) {
		String sourceToRead = "file1.txt";
		String sourceToWrite = "file2.txt";
		String str;
		int count = 1;

		try {
			String longest = (new char[1]).toString();
			String name = (new char[1]).toString();
			FileReader fr = new FileReader(sourceToRead);
			FileWriter fw = new FileWriter(sourceToWrite);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);

			while ((str = br.readLine()) != null) {
				System.out.println("Line " + count + " has " + str.length() + " symbols " + str);
				count++;
				if (str.contains("birth")) {
					name = str;
				}
				if (str.length() > longest.length()) {
					longest = str;
				}
			}
			bw.write("number of lines in file1.txt = " + count);
			bw.newLine();
			bw.write(longest);
			bw.newLine();
			bw.write(name);

			br.close();
			bw.close();

		} catch (FileNotFoundException e) {
			System.out.println("Unable to find file " + sourceToRead.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + sourceToRead.toString());
		}

	}

}
