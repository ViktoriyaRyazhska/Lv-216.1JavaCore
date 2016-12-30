package ua.bilas2;

public class ContractEmployee extends Employee {

	private int sal;
	private int federalTaxIdMember = 0;
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractEmployee(String employeeID, String name) {
		super(employeeID, name);
		// TODO Auto-generated constructor stub
	}
	
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(int federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public void calculatePay() {
		setSalary(sal);
	}

	
}
