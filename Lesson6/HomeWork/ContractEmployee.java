package lesson6.homework;

public class ContractEmployee extends Employee implements CalculatePay {

	/*
	 * Create two classes SalariedEmployee and ContractEmployee, which implement
	 * interface and are inherited from the base class
	 */

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
