package lesson6.homework;

public class SalariedEmployee extends Employee implements CalculatePay {

	/*
	 * Create two classes SalariedEmployee and ContractEmployee, which implement
	 * interface and are inherited from the base class
	 */

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
