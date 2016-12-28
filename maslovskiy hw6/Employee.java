package homework6.Task1.Task2;

public class Employee {
	
	String employeeID;
	private int hourlyRate;
	private int hours;
	
	public Employee(int fixedPayment) {
		super();
		this.fixedPayment = fixedPayment;
	}

	public Employee(int hourlyRate, int hours) {
		super();
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	private int fixedPayment;

	public Employee() {
		super();
	}
	

	
}
