package lesson3;

class Employee {
	/*
	 * Practical task
	 * Console Application project in Java
	 * Add class Employee to the project
	 */
	
	//three private fields: name, rate and hours;
	private String name;
	private double rate;
	private double hours;
	
	//static field totalSum
	public static double totalSum;
	
	//static field totalHours
	public static double totalHours;

	//properties for access to the private fields;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
		totalHours = totalHours + hours;
	}

	//constructors:
	//constructor with 3 parameters
	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalHours = totalHours + hours;
	}
	
	//constructor with 2 parameters (name and rate) and
	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}
	
	//default constructor,
	public Employee(){};
	
	
	//methods:
	//salary - to calculate the salary of person (rate * hours)
	public double salary () {
		totalSum = totalSum + rate*hours;
		return rate*hours;
	}
	
	//toString - to output information about employee
	@Override
	public String toString() {
		return "Employee [name " + name + ", rate = " + rate + ", hours = " + hours + "]";
	}
	
	//changeRate - to change the rate of employee
	public void changeRate(double rate) {
		this.rate = rate;
	}
	
	//bonuses – to calculate 10% from salary
	public double bonuses(){
		return rate*hours*0.1;
	}
		

}
