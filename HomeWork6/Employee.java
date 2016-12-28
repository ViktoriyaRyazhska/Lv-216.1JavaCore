package HomeWork6;

public class Employee implements CalculatePays {
	private String employeeId;
	private String name;
	private double salary; 
	
	public Employee() {
		super();
	}
	public Employee(String employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = 0;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public double calculatePay() {
		
		return salary;
	}
	
	

}
