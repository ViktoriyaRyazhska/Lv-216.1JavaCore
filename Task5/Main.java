package ua.bilas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) - 50;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println();

		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		System.out.println(max);

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				sum += nums[i];
			}
		}

		System.out.println(sum);

		int amountNeg = 0;
		int amountPos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				amountNeg++;
			}
			if (nums[i] > 0) {
				amountPos++;
			}
		}
		System.out.println(amountNeg);

		if (amountNeg > amountPos) {
			System.out.println("there are more negative nums in array");
		} else {
			if (amountNeg < amountPos) {
				System.out.println("there are more positive nums in array");
			} else {
				System.out.println("the same amount.");
			}
		}

		
//		--------------------------------------------------------
		
		
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new Employee("ivan", 25, 1900.00);
		employees[1] = new Employee("oleg", 30, 2000.00);
		employees[2] = new Employee();
		
		employees[2].setName("igor");
		employees[2].setDepartamentNumber(25);
		employees[2].setSalary(3000.00);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter departament number:");
		int numer = scanner.nextInt();
		
		for (Employee employee4 : employees) {
			if (employee4.getDepartamentNumber() == numer) {
				System.out.println(employee4);
			}
		}
		
		Employee tmp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getSalary() < employees[j].getSalary()) {
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j] = tmp;
				}
			}
		}
		
		System.out.println("sort by salary:");
		
		for (Employee employee4 : employees) {
			System.out.println(employee4);
		}
		
		scanner.close();
	}

}
