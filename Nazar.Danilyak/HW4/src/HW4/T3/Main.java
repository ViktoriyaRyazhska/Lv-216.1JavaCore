package HW4.T3;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[] { 6, 7, 8, 9, 10 };
		Task3 task3 = new Task3(array);
		System.out.println(task3.indexTwoInt());
		System.out.println(task3.min());
	}
}