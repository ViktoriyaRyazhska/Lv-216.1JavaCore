package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
	Scanner scn = new Scanner(System.in);
	private String name;
	private int hourlyRate;
	private int fixedPayment = 2500;
	private int salary;
	private int id = 0;
	
	public Employee() {
		input(scn);
	}
	public Employee(String string) {

	}
	public Employee(String name, int hourlyWage, int fixedPayment, int salary) {
		super();
		this.name = name;
		this.hourlyRate = hourlyWage;
		this.fixedPayment = fixedPayment;
		this.salary = salary;
	}
	private void input(Scanner scn) {

		System.out.println("Input name ");
		name = scn.nextLine();
		System.out.println(name + " with fixed payment ? (y/n)");
		String s = scn.nextLine();
		switch(s.toLowerCase()){
			case "y":
				salary = fixedPayment;
				break;
			case "n":
				System.out.println("Input houry rate");
				hourlyRate = Integer.parseInt(scn.nextLine());
				salary = 21*8*hourlyRate;
				break;
			default:
					System.out.println("Input correct answer (y/ n)");
					input(scn);
				break;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getFixedPayment() {
		return fixedPayment;
	}
	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	protected static void writeFromFile(Scanner scn, List<Employee> mapa) {
		try {
			scn = new Scanner(new File("D:\\JAVA\\Eclipse\\SoftserveAcademy\\src\\2.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scn.hasNext()){
			Employee o = new Employee(scn.next());
			mapa.add(o);
		}
		scn.close();
		
	}

	
}
