package task_2;

public class SalariedEmployee extends Employee implements Salary {
	public int hourlyRate;
	public int numberOfHoursWorked;
	public String socialSecurityNumber;

	public SalariedEmployee(String employeeId, String name, int hourlyRate, int numberOfHoursWorked) {
		super(employeeId, name);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public void calculatePay() {
		int theAverageMonthlySalary = hourlyRate * numberOfHoursWorked;
		System.out.println("Salary = " + theAverageMonthlySalary);

	}
}