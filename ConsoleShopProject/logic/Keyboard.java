package shop.logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.crypto.interfaces.PBEKey;

public final class Keyboard {

	public static String inputString(String messageOut) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(messageOut + " -> ");
		return bufferReader.readLine();
	}


	public static int inputInteger(String messageOut) throws NumberFormatException, IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(messageOut + " -> ");
		return Integer.parseInt(bufferReader.readLine());
	}

	public static double inputDouble(String messageOut) throws NumberFormatException, IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(messageOut + " -> ");
		return Double.parseDouble(bufferReader.readLine());
	}

	public static boolean inputBoolean(String maessageOut) {
		System.out.println(maessageOut + " -> ");
		boolean inputBoolean = false;
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputBoolean = Boolean.parseBoolean(bufferReader.readLine());
		} catch (IOException e) {
			System.err.println(e);
		}
		return inputBoolean;
	}

	public static String inputEmail(String messageOut) {
		System.out.println(messageOut + " -> ");
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		try {
			s = bufferReader.readLine();
		} catch (IOException e) {
			System.out.println(e);
		}

		return s;
	}

}
