package homeworks.day6;

public class ContractEmployee extends Employee {

	private int fixedMonthlyPayment;
	private String federalTaxIdmember;

	public ContractEmployee(String employeeID, String name, int fixedMonthlyPayment, String federalTaxIdmember) {
		super(employeeID, name);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public double calculatePay() {
		super.setSalary(fixedMonthlyPayment);
		return super.getSalary();
	}
}
