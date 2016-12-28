package HomeWork6;

public class ContractEmployee extends Employee implements CalculatePays {
	private String federalTaxIdmember ;
	
	
	
	public ContractEmployee(String employeeId, String name, String federalTaxIdmember) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
		
		// TODO Auto-generated constructor stub
	}


	

	public void setSalary(double hour, double hourWork) {
		super.setSalary(hour * hourWork);
	}


	@Override
	public double calculatePay() {
		
		return super.calculatePay();
	}

}
