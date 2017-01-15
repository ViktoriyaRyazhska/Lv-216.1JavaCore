package homework.a2;

import java.util.Random;

/*
 * read 3 integer numbers and write max and min of them;

 */
public class Main {
	public static void main(String[] args) {
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("a [ " + i + " ]={ " + a[i] + " }");
		}
		int tempMax = a[0];
		int tempMin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > tempMax) {
				tempMax = a[i];
			}
			if (a[i] < tempMin) {
				tempMin = a[i];
			}
		}
		System.out.println("max [ "+tempMax+" ] ");
		System.out.println("max [ "+tempMin+" ] ");
	}

}
