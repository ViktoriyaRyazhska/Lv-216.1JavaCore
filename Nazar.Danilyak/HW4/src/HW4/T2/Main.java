package HW4.T2;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Numbers number = new Numbers(array);
		System.out.println(number.summ());
	}
}