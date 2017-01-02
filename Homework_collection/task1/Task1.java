package task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Map<String, String> person = new HashMap<String, String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten FirstName and LastName: ");
		for (int i = 0; i < 10; i++) 
		{
			person.put(input.nextLine(), input.nextLine());
		}
		System.out.println("Ours person: ");
		for (Map.Entry<String, String> entry : person.entrySet()) 
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		int account = 0;
		System.out.println("Check coincidence of firstName:");
		for (Map.Entry<String, String> entry : person.entrySet()) {
			if (account > 0) {
				break;
			}
			for (Map.Entry<String, String> entry2 : person.entrySet()) {
				if (entry.getValue().equals(entry2.getValue()) && !entry.getKey().equals(entry2.getKey())) {
					System.out.println(" - two persons with the same firstName: " + entry.getValue());
					account++;
					break;
				}
			}
		}
		System.out.println("Enter to remove");
		String fromRemove = input.nextLine();
		for (Iterator<Map.Entry<String, String>> it = person.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> entry = it.next();
			if (entry.getValue().equals(fromRemove)) {
				it.remove();
			}
		}

		for (Map.Entry<String, String> entry : person.entrySet()) // для виводу
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}