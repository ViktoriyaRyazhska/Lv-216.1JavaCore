package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class ManySpaces {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String centence = bufferedReader.readLine().replaceAll("([\\s]){1,}", " ");
		System.out.println("Centence whithout spaces :" +"\n" + centence);

	}

}
