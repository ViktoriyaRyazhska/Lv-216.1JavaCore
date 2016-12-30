package ua.bilas2;

public class Main {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		
		employees[0] = new SalariedEmployee("one", "ivan");
		employees[1] = new ContractEmployee("two", "oleg");
		employees[2] = new SalariedEmployee("three", "igor");
		
		((ContractEmployee) employees[1]).setSal(2000);
		((SalariedEmployee) employees[0]).setHourlyRate(20);
		((SalariedEmployee) employees[2]).setHourlyRate(15);
		((SalariedEmployee) employees[0]).setNumOfHours(160);
		((SalariedEmployee) employees[2]).setNumOfHours(150);
		for (Employee employee : employees) {
			employee.calculatePay();
		}
		
		Employee tmp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if(employees[i].getSalary() < employees[j].getSalary()){
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j] = tmp;
				}
			}
		}
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
