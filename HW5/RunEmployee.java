package homeworks.day6;

public class RunEmployee {

    public static void main(String[] args) {

	Employee temp = new Employee();
	Employee[] employee = new Employee[4];
	employee[0] = new SalariedEmployee("1", "Pylypenko", 135, 25, "85236452");
	employee[1] = new SalariedEmployee("2", "Fedoseev", 111, 21, "75395182");
	employee[2] = new ContractEmployee("3", "Lutsyshyn", 2100, "85264197");
	employee[3] = new ContractEmployee("4", "Rekrutiv", 1800, "85214693");

	for (int i = 0; i < employee.length - 1; i++) {
	    for (int j = i + 1; j < employee.length; j++) {
		if (((Employee) employee[i]).calculatePay() < ((Employee) employee[j]).calculatePay()) {
		    temp = employee[i];
		    employee[i] = employee[j];
		    employee[j] = temp;
		}
	    }
	}

	for (int i = 0; i < employee.length; i++) {
	    employee[i].info();
	}
    }
}
