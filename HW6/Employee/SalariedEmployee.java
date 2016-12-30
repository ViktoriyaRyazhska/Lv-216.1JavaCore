package ua.bilas2;

public class SalariedEmployee extends Employee {
	
	private int socialSecurityNumber = 0;
	private int hourlyRate;
	private int numOfHours;
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumOfHours() {
		return numOfHours;
	}

	public void setNumOfHours(int numOfHours) {
		this.numOfHours = numOfHours;
	}

	public SalariedEmployee(String employeeID, String name) {
		super(employeeID, name);
		// TODO Auto-generated constructor stub
	}
	
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public void calculatePay() {
		setSalary(hourlyRate * numOfHours);
	}

	
}
