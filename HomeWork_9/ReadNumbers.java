package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumbers {

	public static void main(String[] args) {

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Set the range [start, end ]");

		int inputStart = 0;
		int inputEnd = 0;

		/* Validation of input range */
		try {
			inputStart = Integer.parseInt(bReader.readLine());
			inputEnd = Integer.parseInt(bReader.readLine());
		} catch (NumberFormatException | IOException e) {

			System.err.println("Invalid data format");

		}

		/* Validation of input numbers */
		System.out.println("Set 10 numbers");
		try {
			for (int i = 0; i < 10; i++) {
				int outputNum = readNumber(inputStart, inputEnd);
				System.out.println(outputNum);
			}
		} catch (NumberFormatException | IOException e) {
			System.err.println("Invalid data format, only integers can be permitted");
		} catch (NumbersRangeException e) {
			System.err.println(e.getMessage());
		}
	}

	public static int readNumber(int start, int end) throws NumberFormatException, IOException, NumbersRangeException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(bReader.readLine());

		if ((number >= start) && (number <= end)) {
			return number;

		} else {
			bReader.close();
			throw new NumbersRangeException("The number is not in range");
		}

	}

}
