package Lesson5;

public class Employee5_2 {
	// fields name, department number, salary
	private String name;
	private int depNum;
	private int salary;

	// getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepNum() {
		return depNum;
	}

	public void setDepNum(int depNum) {
		this.depNum = depNum;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// constructor with three parameters
	public Employee5_2(String name, int depNum, int salary) {
		setName(name);
		setDepNum(depNum);
		setSalary(salary);
	}

	// method to display all employees of a certain department
	public static void allEmpOfCerDip(Object obj[], int a) {
		System.out.println("The list of employees after department " + a
				+ " below");
		for (int i = 0; i < obj.length; i++) {
			if (((Employee5_2) obj[i]).getDepNum() == a) {
				System.out.println("Employee [name "
						+ ((Employee5_2) obj[i]).getName() + "," + " salary = "
						+ ((Employee5_2) obj[i]).getSalary() + "]");
			}
		}

	}

	// method to arrange workers by the field salary in descending order
	public static void arrEmpBySallary(Object obj[]) {
		System.out
				.println("The list of all employees by the field salary in descending order below");
		Employee5_2 temp;
		for (int i = 0; i < obj.length - 1; i++) {
			for (int j = i + 1; j < obj.length; j++) {
				if (((Employee5_2) obj[j]).getSalary() > ((Employee5_2) obj[i])
						.getSalary()) {
					temp = (Employee5_2) obj[i];
					obj[i] = obj[j];
					obj[j] = temp;
				}
			}
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.println("Employee [name "
					+ ((Employee5_2) obj[i]).getName() + ", "
					+ "department number " + ((Employee5_2) obj[i]).depNum
					+ ", " + "salary = " + ((Employee5_2) obj[i]).getSalary()
					+ "]");
		}

	}
}
