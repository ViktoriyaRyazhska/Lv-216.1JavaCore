package task2;

public class Main {

	public static void main(String[] args) {

		Employee[] array = new Employee[4];

		array[0] = new ContractEmployee("01", "Dmutro", 4000, "45604");
		array[1] = new ContractEmployee("02", "Stepan", 5000, "12303");
		array[2] = new SalariedEmployee("03", "Ivan", 20.5, 185, "45601");
		array[3] = new SalariedEmployee("04", "Petro", 15.7, 300, "78902");

		for (int k = 0; k < array.length; k++) {
			((Calculate) array[k]).calculatePay();
		}

		Employee employeeTmp = new Employee();

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getMonthlySalary() < array[j].getMonthlySalary()) {
					employeeTmp = array[i];
					array[i] = array[j];
					array[j] = employeeTmp;
				}
			}
		}

		for (Employee listEmployee : array) {
			System.out.println(listEmployee);
		}
	}

}
