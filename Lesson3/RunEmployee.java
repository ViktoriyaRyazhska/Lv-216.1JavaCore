package lesson3;

public class RunEmployee {
	
	/*
	 * Practical task
	 * Console Application project in Java
	 * Run class Employee
	 */

	public static void main(String[] args) {
		//create 3 objects of Employee type. Input information about them 
		Employee emp1 = new Employee("Ivanenko", 16.22, 155);
		
		Employee emp2 = new Employee("Petrenko", 20.01);
	        emp2.setHours(160);
	        
	    Employee emp3 = new Employee();
	        emp3.setName("Sydorenko");
	        emp3.setRate(19.25);
	        emp3.setHours(145);
	    
	    //Display info of all workers to screen
	    System.out.print(emp1.toString() + "\t");
	    System.out.printf(" Salary of " + emp1.getName() + " = " + "%.2f",emp1.salary());
	    System.out.println("\t");
	    
	    System.out.print(emp2.toString() + "\t");
	    System.out.printf(" Salary of " + emp2.getName() + " = " + "%.2f",emp2.salary());
	    System.out.println("\t");
	    
	    System.out.print(emp3.toString() + "\t");
	    System.out.printf(" Salary of " + emp3.getName() + " = " + "%.2f",emp3.salary());
	    System.out.println("\t");
	    
	    //Display the total hours of all workers to screen
	    System.out.println("Total hours of all workers = " + Employee.totalHours );
	    
	    //Display the total salary of all workers to screen
	    System.out.println("Total salary of all workers = " + Employee.totalSum );

	}

}
