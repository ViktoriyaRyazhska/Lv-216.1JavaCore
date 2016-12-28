package HomeWork6;

public class RunEmpliyee {

	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		employees[0] = new SalariedEmployee("1", "Oleh", "1");
		((SalariedEmployee)employees[0]).setSalary(2000);
		employees[1] = new ContractEmployee("2", "Ivan", "2");
		((ContractEmployee)employees[1]).setSalary(20, 250);
		employees[2] = new SalariedEmployee("3", "Olha", "3");
		((SalariedEmployee)employees[2]).setSalary(1800);
		employees[3] = new ContractEmployee("4", "Mariya", "4");
		((ContractEmployee)employees[3]).setSalary(30, 150);
		
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					Employee tmp = new Employee();
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j] = tmp;
					
				}
			}
		}
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

	}

}
