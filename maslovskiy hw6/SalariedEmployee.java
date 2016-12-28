package homework6.Task1.Task2;

public class SalariedEmployee extends Employee implements Calculate{
	
	public SalariedEmployee() {
	super();
	// TODO Auto-generated constructor stub
}

		public SalariedEmployee(int hourlyRate, int hours) {
		super(hourlyRate, hours);
		// TODO Auto-generated constructor stub
	}
		private int hourlyRate;
		private int hours;
		private String socialSecurityNumber ;

	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	@Override
	public int calculatePay() {
		setHours(150);
		setHourlyRate(8);
		return hours*hourlyRate;
	}


}
