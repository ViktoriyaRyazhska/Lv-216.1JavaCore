package task2;

public class ContractEmployee extends Employee implements Calculate {

	private double fixedPayment;
	private String federalTaxIdmember;

	public ContractEmployee(String employeeId, String name, double aFixedPayment, String aFederalTaxIdmember) {
		super(employeeId, name);
		fixedPayment = aFixedPayment;
		federalTaxIdmember = aFederalTaxIdmember;

	}

	@Override
	public void calculatePay() {
		setMonthlySalary(fixedPayment);
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

}
