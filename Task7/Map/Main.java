package ua.bilas2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> employeeMap = new TreeMap<>();
		
		int i = 1;
		
		while (i <=7) {
			System.out.println("add name:");
			String name = scanner.nextLine();
			employeeMap.put(i++, name);
			
		}
		
		System.out.println(employeeMap);
		
		System.out.println("add user ID:");
		int id = scanner.nextInt();
		
		if (employeeMap.containsKey(id)) {
			System.out.println("user name: " + employeeMap.get(id));
			
		} else {
			System.out.println("there is no user with " + id + " ID number");
		}
		
		System.out.println("add user name:");
		String name = scanner.nextLine();
		
		if (employeeMap.containsValue(name)) {
			System.out.println("user ID - " + employeeMap.get(id));
		} else {
			System.out.println("there is no user with name " + name);
		}
		
		scanner.close();
	}
}
