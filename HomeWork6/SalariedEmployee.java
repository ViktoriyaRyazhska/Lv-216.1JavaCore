package HomeWork6;

public class SalariedEmployee extends Employee implements CalculatePays {
	private String socialSecurityNumber;
	
	

	public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calculatePay() {
		
		return super.calculatePay();
	}


	public void setSalary(double salary) {
		super.setSalary(salary);
	}

}
