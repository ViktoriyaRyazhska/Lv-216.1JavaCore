package homework6.Task1.Task2;

public class ContractEmployee extends Employee implements Calculate{

	public ContractEmployee(int fixedPayment) {
		super(fixedPayment);
		// TODO Auto-generated constructor stub
	}
	private int fixedPayment;
	private int federalTaxIdmember ;

	public int getFixedPayment() {
		return fixedPayment;
	}
	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return fixedPayment;
	}

}
