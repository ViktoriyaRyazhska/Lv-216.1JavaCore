package homeworks.day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

    public static void main(String[] args) throws IOException {
	String sourceToRead = "text.txt";
	String sourceToWrite = "text1.txt";
	String str;
	int count = 1;

	
	    String longest = (new char[1]).toString();
	    String name = (new char[1]).toString();
	    FileReader fr = new FileReader(sourceToRead);
	    FileWriter fw = new FileWriter(sourceToWrite);
	    BufferedReader br = new BufferedReader(fr);
	    BufferedWriter bw = new BufferedWriter(fw);

	    while ((str = br.readLine()) != null) {
		System.out.println("Line " + count + " has " + str.length() + " symbols " + str);
		count++;
		if (str.contains("birthday")) {
		    name = str;
		}
		if (str.length() > longest.length()) {
		    longest = str;
		}
	    }
	    bw.write("number of lines = " + count);
	    bw.write(longest);;
	    bw.write(name);

    }

}