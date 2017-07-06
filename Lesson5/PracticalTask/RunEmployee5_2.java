package Lesson5;

import java.util.Scanner;

public class RunEmployee5_2 {

	public static void main(String[] args) {
		// five objects of class Employee
		Employee5_2[] emp = new Employee5_2[5];
		emp[0] = new Employee5_2("Ivanenko", 112, 2600);
		emp[1] = new Employee5_2("Petrenko", 115, 3500);
		emp[2] = new Employee5_2("Sydorenko", 112, 2900);
		emp[3] = new Employee5_2("Pavlenko", 117, 3200);
		emp[4] = new Employee5_2("Stepanenko", 112, 3900);

		Scanner sc = new Scanner(System.in);

		// display all employees of a certain department (enter department
		// number in the console)
		System.out.println("Type number of department");
		int a = sc.nextInt();
		Employee5_2.allEmpOfCerDip(emp, a);

		// arrange workers by the field salary in descending order
		Employee5_2.arrEmpBySallary(emp);

		sc.close();
	}
}
