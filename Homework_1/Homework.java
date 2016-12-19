import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Домашнє завдання
		// Задача №1
		System.out.println("Задача №1");
		double area, perimeter;
		System.out.println("Введіть значення радіуса");
		int radius = Integer.parseInt(br.readLine());
		perimeter = 2 * radius * Math.PI;
		area = Math.PI * radius * radius;
		System.out.println("Периметр квітника = " + perimeter + ", площа квітника = " + area);

		// Задача №2
		System.out.println("Задача №2");
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where are you live," + name);
		String address = br.readLine();
		System.out.println(name + " lives in " + address);

		// Задача №3
		System.out.println("Задача №3");
		System.out.println("Введіть ціну за хвилину розмови та тривалість розмови для:");
		System.out.println(" країни №1 = ");
		int c1 = Integer.parseInt(br.readLine());
		int t1 = Integer.parseInt(br.readLine());
		System.out.println(" країни №2 = ");
		int c2 = Integer.parseInt(br.readLine());
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("  країни №3 = ");
		int c3 = Integer.parseInt(br.readLine());
		int t3 = Integer.parseInt(br.readLine());
		System.out.println("Вартісь розмови для країни №1 = " + c1 * t1 + "; Вартісь розмови для країни №2 = " + c2 * t2
				+ "; Вартісь розмови для країни №3 = " + c3 * t3 + " умовних  одиниць.");
		System.out.println("Загальна сумма витрат = " + (c1 * t1 + c2 * t2 + c3 * t3) + " умовних  одиниць.");
	}
}