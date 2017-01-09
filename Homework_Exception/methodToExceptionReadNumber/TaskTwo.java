package methodToExceptionReadNumber;

import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) throws Exception {
		readNumber(1, 100);
	}

	public static int readNumber(int start, int end) throws Exception {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {
			int a = input.nextInt();
			if ((a > start) && (a < end)) {
				start = a;
				System.out.println(a);
			} else {
				throw new Exception("Bad Number");
			}
		}
		return -1;
	}
}