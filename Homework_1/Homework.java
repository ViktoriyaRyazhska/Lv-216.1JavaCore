import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ������� ��������
		// ������ �1
		System.out.println("������ �1");
		double area, perimeter;
		System.out.println("������ �������� ������");
		int radius = Integer.parseInt(br.readLine());
		perimeter = 2 * radius * Math.PI;
		area = Math.PI * radius * radius;
		System.out.println("�������� ������� = " + perimeter + ", ����� ������� = " + area);

		// ������ �2
		System.out.println("������ �2");
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where are you live," + name);
		String address = br.readLine();
		System.out.println(name + " lives in " + address);

		// ������ �3
		System.out.println("������ �3");
		System.out.println("������ ���� �� ������� ������� �� ��������� ������� ���:");
		System.out.println(" ����� �1 = ");
		int c1 = Integer.parseInt(br.readLine());
		int t1 = Integer.parseInt(br.readLine());
		System.out.println(" ����� �2 = ");
		int c2 = Integer.parseInt(br.readLine());
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("  ����� �3 = ");
		int c3 = Integer.parseInt(br.readLine());
		int t3 = Integer.parseInt(br.readLine());
		System.out.println("������ ������� ��� ����� �1 = " + c1 * t1 + "; ������ ������� ��� ����� �2 = " + c2 * t2
				+ "; ������ ������� ��� ����� �3 = " + c3 * t3 + " �������  �������.");
		System.out.println("�������� ����� ������ = " + (c1 * t1 + c2 * t2 + c3 * t3) + " �������  �������.");
	}
}