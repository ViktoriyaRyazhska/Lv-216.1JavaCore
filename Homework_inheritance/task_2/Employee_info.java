package task_2;

public class Employee_info {
public static void main(String[] args) {
	Employee employee1[] = new Employee[4];
	employee1[0]= new SalariedEmployee("01","Bodia",30,40);
	employee1[1]= new SalariedEmployee("02","Roman",40,40);
	employee1[2]= new ContractEmployee("03","Taras",4000);
	employee1[3]= new ContractEmployee("04","Orest",1500);
	for(int i = 0; i<4; i++){
	System.out.println("Information about employee_"+i+":");
	System.out.println("employee Id: "+employee1[i].getEmployeeId());
	System.out.println("name: "+employee1[i].getName());
	((Salary) employee1[i]).calculatePay();
	System.out.println(" ");
}
}
}
