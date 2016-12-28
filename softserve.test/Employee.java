package arrr;

public class Employee {
	
	private String name;
	private int workingExperience;
	private int payment;
	
//	public Employee() {
//		super();
//	}
	public Employee(String name, int workingExperience, int payment) {
		super();
		this.name = name;
		this.workingExperience = workingExperience;
		this.payment = payment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkingExperience() {
		return workingExperience;
	}
	public void setWorkingExperience(int workingExperience) {
		this.workingExperience = workingExperience;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	
}
