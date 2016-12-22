package homeworks.day5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	System.out.println("Enter the number of month");
	int n = sc.nextInt();
	System.out.println("In this month "+month_days[n-1]+" days");

    }

}
