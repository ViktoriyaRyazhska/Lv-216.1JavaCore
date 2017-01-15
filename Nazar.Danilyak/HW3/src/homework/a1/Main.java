package homework.a1;

import java.util.Random;

/*
 * read 3 float numbers and check:
 *  are they all belong to the range [-5,5];

 */
public class Main {
	public static void main(String[] args) {
		float a[] = new float[3];
		for (int i = 0; i < 3; i++) {
			a[i] = new Random().nextFloat()+new Random().nextInt(20)-10;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > -5 && a[i] < 5) {
				System.out.println(a[i] + " ª [-5;5]");
			}
		}
	}
}
