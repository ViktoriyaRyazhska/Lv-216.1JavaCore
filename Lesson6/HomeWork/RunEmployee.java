package lesson6.homework;

public class RunEmployee {

	/*
	 * Create an array of employees and add the employees with different form of
	 * payment. Arrange the entire sequence of workers descending the average
	 * monthly wage. Output the employee ID, name, and the average monthly wage
	 * for all elements of the list.
	 */

	public static void main(String[] args) {

		Employee temp = new Employee();
		Employee[] emp = new Employee[4];
		emp[0] = new SalariedEmployee("001", "Ivanenko", 128, 18.25, "27071991");
		emp[1] = new SalariedEmployee("002", "Petrenko", 120, 24.15, "15121994");
		emp[2] = new ContractEmployee("003", "Sydorenko", 2800, "20051414");
		emp[3] = new ContractEmployee("004", "Pavlenko", 2950, "20065303");

		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (((Employee) emp[i]).calculatePay() < ((Employee) emp[j]).calculatePay()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < emp.length; i++) {
			emp[i].info();
		}
	}
}
