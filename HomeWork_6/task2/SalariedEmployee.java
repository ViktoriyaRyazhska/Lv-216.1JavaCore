package task2;

public class SalariedEmployee extends Employee implements Calculate {

	private double rate;
	private double hours;
	private String socialSecurityNumber;

	public SalariedEmployee(String employeeId, String name, double rate, double hours, String aSocialSecurityNumber) {
		super(employeeId, name);
		this.rate = rate;
		this.hours = hours;
		socialSecurityNumber = aSocialSecurityNumber;

	}

	@Override
	public void calculatePay() {
		setMonthlySalary(rate * hours);

	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public double getRate() {
		return rate;
	}

	public double getHours() {
		return hours;
	}

}
