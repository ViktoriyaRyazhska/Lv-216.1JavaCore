package homeworks.day6;

public class Employee implements CalculatePay {

	private String employeeID;
	private String name;
	private double salary;

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// constructors
	public Employee() {

	}

	public Employee(String employeeID, String name) {
		setEmployeeID(employeeID);
		setName(name);
	}

	public void info() {
		System.out.println("Employee ID " + getEmployeeID() + ", name " + getName() + ", average monthly wage "
				+ getSalary());
	}

	@Override
	public double calculatePay() {
		return salary;
	}
}
