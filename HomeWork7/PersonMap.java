package HomeWork7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonMap {

	public static void main(String[] args) {
	
		Map<String, String> personMap = new HashMap<>();
		personMap.put("Monyanchun", "Vasil");
		personMap.put("Melnyk", "Vitalij");
		personMap.put("Parhovych", "Petro");
		personMap.put("Kovalchuk", "Oleh");
		personMap.put("Gumenyuk", "Oksana");
		personMap.put("Bogajko", "Iryna");
		personMap.put("Nagay", "Orest");
		personMap.put("Kolobova", "Olha");
		personMap.put("Magera", "Mariya");
		personMap.put("Semenyuk", "Orest");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " "	+ entry.getValue());
			}
		System.out.println();
		
		int sameName = 0;
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
				if ((entry.getValue() == entry2.getValue())&&(entry.getKey()!=entry2.getKey())) {
					sameName++;
				}
			}
		}
		if (sameName > 0) {
			System.out.println("There are at less two persons with the same firstName");
		}
		else System.out.println("No two persons with the same firstName");
		System.out.println();
		
		
		Iterator<Map.Entry<String,String>> iter = personMap.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry<String,String> entry = iter.next();
		    if(entry.getValue()=="Orest"){
		        iter.remove();
		    }
		}
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " "	+ entry.getValue());
			}
		
		
	}

}
