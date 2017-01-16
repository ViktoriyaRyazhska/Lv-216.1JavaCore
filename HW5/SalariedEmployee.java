package homeworks.day6;

public class SalariedEmployee extends Employee{

	private int hours;
	private double hourlyRate;
	private String socialSecurityNumber;

	public SalariedEmployee(String employeeID, String name, int hours, double hourlyRate, String socialSecurityNumber) {
		super(employeeID, name);
		this.hours = hours;
		this.hourlyRate = hourlyRate;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		super.setSalary(hours * hourlyRate);
		return super.getSalary();
	}
}
