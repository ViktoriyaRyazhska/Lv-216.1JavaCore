package arrr;
import java.io.*;
import java.util.Scanner;

public class Manager {
	
		static Scanner s;
		Employee [] e = new Employee[5];
		
	public static void main(String[] args) {
		
		String [] [] st = new String[5][3];
		Employee [] e = new Employee[5];
		e[0] = new Employee("Ivan", 19, 2100); 
		e[1] = new Employee("Andriy", 5, 1600); 
		e[2] = new Employee("Oleg", 12, 1800); 
		e[3] = new Employee("Volodymyr", 20, 2500); 
		e[4] = new Employee("Igor", 8, 1700); 

		maxExperience(e);
		maxPayment(e);
		experience(e);
		payment(e);
		writeFile(e);
		openFile();
		readFile(st);
		out(st);
		
	}
	
	private static void out(String[][] st) {
		for(int i = 0;i<st.length;i++){
			for(int k = 0;k<st[i].length;k++){
				System.out.print(st[i][k]+ " ");
			}
			System.out.println();
		}
		
	}

	private static void openFile() {
		try {
			s = new Scanner(new File("res//2.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	private static void readFile(String[][] st) {
		while(s.hasNext()){
			for(int i = 0;i<st.length;i++){
				for(int k = 0;k<st[i].length;k++){
					st[i][k] = s.next();
					
				}
				
			}
		}
		
	}

	private static void save(Employee[] e , String fileName) throws FileNotFoundException{
		  PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
		    for (Employee emp: e )
		        pw.println( " Name : " + emp.getName() + " Experience : " + emp.getWorkingExperience() + " Payment " + emp.getPayment());
		    pw.close();	
		
	}

	private static void writeFile(Employee[] e2) {
		try {
			String fileName = "D:\\JAVA\\Eclipse\\SoftserveAcademy\\src\\1.txt";
			save(e2, fileName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

	private static void maxPayment(Employee[] e) {
		int max = e[0].getPayment();
		int imax = 0;
		
		for(int i = 1; i<e.length;i++){
			if(max < e[i].getPayment()){
				max = e[i].getPayment();
				imax = i;
			}
			
		}
		System.out.println(e[imax].getName() +" has the maximal payment : " + max);
	}

	private static void maxExperience(Employee[] e) {
		int max = e[0].getWorkingExperience();
		int imax = 0;
		for(int i = 1; i<e.length;i++){
			if(max < e[i].getWorkingExperience()){
				max = e[i].getWorkingExperience();
				imax = i;
			}
			
		}
		System.out.println(e[imax].getName() +" has the maximal experience : " + max);
	}

	private static void payment(Employee[] e) {
		int general = 0;
		for(int i = 1; i<e.length;i++){
			general +=e[i].getPayment();
			}
			System.out.println("The general payment for work that has been done is : " + general);
		}

	private static void experience(Employee[] e) {
		int general = 0;
		for(int i = 1; i<e.length;i++){
			general +=e[i].getWorkingExperience();
			}
			System.out.println("The general experience of all employers is : " + general);
		}
		
		
	
		
	}


