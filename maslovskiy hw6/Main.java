package homework6.Task1.Task2;

public class Main {

	public static void main(String[] args) {
		
		Employee ew = new SalariedEmployee();
		((SalariedEmployee)ew).calculatePay();
		
		
		Employee [] e = new Employee[5];
		
		e[0] = new SalariedEmployee(10,160);
		e[1] = new ContractEmployee(2100);
		e[2] = new SalariedEmployee(8,155);
		e[3] = new ContractEmployee(1900);
		e[4] = new SalariedEmployee(11,165);

		for(int i = 0; i < e.length; i++){
			((SalariedEmployee)e[i]).calculatePay();
			((ContractEmployee)e[i]).calculatePay();
		}
		
		
	}

}
