package task2;

public class Employee {

	private String employeeId;
	private String name;

	private double monthlySalary;

	public Employee() {

	}

	public Employee(String employeeId, String name) {

		this.employeeId = employeeId;
		this.name = name;

	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + employeeId + ", name : " + name + ", monthlySalary : " + monthlySalary + "]";
	}

}
