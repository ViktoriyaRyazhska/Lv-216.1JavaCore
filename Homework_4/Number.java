import java.util.Scanner;

public class Number {
	public static float a;
	public float b;
	public float c;
	public int a1;
	public int b1;
	public int c1;
	public int HTTP_error;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers of type float");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		if (a <= 5 && a >= -5) {
			System.out.println("A = " + a + " and lies in the range of [-5, 5]");
		} else {
			System.out.println("Given the number of " + a + " does not lie in the range of [-5, 5]");
		}
		if (b <= 5 && b >= -5) {
			System.out.println("B = " + b + " and lies in the range of [-5, 5]");
		} else {
			System.out.println("Given the number of " + b + " does not lie in the range of [-5, 5]");
		}
		if (c <= 5 && c >= -5) {
			System.out.println("C =" + c + " and lies in the range of [-5, 5]");
		} else {
			System.out.println("Given the number of " + c + " does not lie in the range of [-5, 5]");
		}

		System.out.println("Enter three numbers of type int");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		if (a > b && a > c && b > c) {
			System.out.println("A - max; C - min.");
		}
		if (b1 > a1 && b1 > c1 && a1 > c1) {
			System.out.println("B - max; C - min.");
		}
		if (a1 > b1 && a1 > c1 && c1 > b1) {
			System.out.println("A - max, B - min.");
		}
		if (b1 > a1 && b1 > c1 && c1 > a1) {
			System.out.println("B - max, A - min.");
		}
		if (c1 > b1 && c1 > a1 && b1 > a1) {
			System.out.println("C - max, A - min.");
		}
		if (c1 > b1 && c1 > a1 && a1 > b1) {
			System.out.println("C - max, B - min.");
		}

		int input = sc.nextInt();

		HTTPError.printError(input);
	}

}
