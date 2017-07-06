package lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Maps {
	/*
	 * In the main() method declare map employeeMap of pairs <Integer, String>.
	 * Add to employeeMap seven pairs (ID, name) of some persons. Display the
	 * map on the screen. Ask user to enter ID, then find and write
	 * corresponding name from your map. If you can't find this ID - say about
	 * it to user (use function containsKey()). Ask user to enter name, verify
	 * than you have name in your map and write corresponding ID. If you can't
	 * find this name - say about it to user (use function containsValue()).
	 */

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();

		employeeMap.put(1, "Ivanenko");
		employeeMap.put(2, "Petrenko");
		employeeMap.put(3, "Sydorenko");
		employeeMap.put(4, "Pavlenko");
		employeeMap.put(5, "Stepanenko");
		employeeMap.put(6, "Yaroslavenko");
		employeeMap.put(7, "Sergienko");

		for (Integer key : employeeMap.keySet()) {
			String value = employeeMap.get(key);
			System.out.println(key + ": " + value);
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("Type an ID of employee");
		int id = sc.nextInt();
		if (employeeMap.containsKey(id)) {
			System.out.println(employeeMap.get(id));
		} else {
			System.out.println("There is no employee with ID : " + id);
		}

		System.out.println("Type the name of employee");

		// Iterator<Integer, String> iterator = employeeMap.iterator();

		String s = sc.next();
		if (employeeMap.containsValue(s)) {
			int key = -1;
			for (Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(s)) {
					key = entry.getKey();
				}
			}
			System.out.println("The ID of employe's name " + s + " is " + key);
		} else {
			System.out.println("There is no employee with name : " + s);
		}

		sc.close();
	}

}
