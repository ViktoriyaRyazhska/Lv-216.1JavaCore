package homework1;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Employee> mapa = new ArrayList<Employee>();

		newEmployee(scn,mapa);
		setId(mapa);
		askToSort(scn,mapa);
		trySave(mapa);	
		System.out.println();
		firstFive(mapa);
		System.out.println();
		idThreeLast(mapa);
		System.out.println();

	}

	private static void idThreeLast(List<Employee> mapa) {
				
		int x = mapa.size();
		System.out.println("Id : " + mapa.get(x-3).getId());
		System.out.println("Id : " + mapa.get(x-2).getId());
		System.out.println("Id : " + mapa.get(x-1).getId());
	}

	private static void firstFive(List<Employee> mapa) {
		int x = 1;
		for(Employee emp: mapa ){
			if(x<6){
				System.out.println("Id : " + emp.getId() + " Name : " + emp.getName() + " Salary : " + emp.getSalary());
				x++;
			}
		}
		
	}

	private static void trySave(List<Employee> mapa) {
		try {
			String fileName = "D:\\JAVA\\Eclipse\\SoftserveAcademy\\src\\1.txt";
			save(mapa, fileName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void setId(List<Employee> mapa) {
		int id = 1;
		for(Employee emp: mapa ){
			emp.setId(id);
			id++;
		}
	}

	private static void newEmployee(Scanner scn, List<Employee> mapa) {
		String s = "y";
		System.out.println("Input first employee ? (y/n)");
		String s1 = scn.nextLine();
		mapa.add(new Employee());
		while(s1.toLowerCase().equals(s)){
			System.out.println("Do you want to add new employee ? (y/n)");
			String s2 = scn.nextLine();
			if(s2.equals("n")){
				break;
			}
			mapa.add(new Employee());
			s1 = s2;
		} 
	}

	private static void askToSort(Scanner scn, List<Employee> mapa) {
		System.out.println("Do you want to sort it? (y/n)");
		String s2 = scn.nextLine();
		switch(s2.toLowerCase()){
		case "y":
			sort(mapa);
			break;
		case "n":
			break;
		default:
			System.out.println("Input y or n !!!");
			askToSort(scn, mapa);
		}		
	}

	private static void save(List<Employee> mapa, String fileName) throws FileNotFoundException{
		  PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		    for (Employee emp: mapa )
		        pw.println("Id : " + emp.getId() + " Name : " + emp.getName() + " Salary : " + emp.getSalary());
		    pw.close();		
	}
	
	private static void sort(List<Employee> mapa) {
	
		Collections.sort(mapa, Collections.reverseOrder(new Comparator<Employee>() {
	         @Override
	        public int compare(Employee e1, Employee e2) {

	                return ((Employee)e1).getSalary() - ((Employee)e2).getSalary();
	        }
	    }));
		for(Employee emp: mapa ){
			System.out.println("Id : " + emp.getId() + " Name : " + emp.getName() + " Salary : " + emp.getSalary());
			
		}
	}
}

