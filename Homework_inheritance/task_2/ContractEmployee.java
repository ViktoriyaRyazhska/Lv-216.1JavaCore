package task_2;

public class ContractEmployee extends Employee implements Salary {
	public int fixedMonthlyPayment;
	public int federalTaxIdmember;

	public ContractEmployee(String employeeId, String name,int fixedMonthlyPayment) {
		super(employeeId,name);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		
	}

	@Override
	public void calculatePay() {
		int theAverageMonthlySalary = fixedMonthlyPayment;
		System.out.println("Salary = "+theAverageMonthlySalary);
		
		}

}
