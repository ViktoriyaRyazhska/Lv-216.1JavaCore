package task_2;

public class Employee {
	private String employeeId;
	private String name;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String employeeId,String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

}