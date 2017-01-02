package homeworks.day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Task2 {

    public static void coincidence(Map<String, String> map) {
	int n = 0;
	for (Entry<String, String> entry : map.entrySet()) {
	    String name = entry.getValue();
	    for (Entry<String, String> entry1 : map.entrySet()) {
		if (entry == entry1) {
		    continue;
		} else if (name.equals(entry1.getValue())) {
		    n++;
		}
	    }
	}
	if (n > 1) {
	    System.out.println("There are at lest two people with the same name.");
	} else {
	    System.out.println("There are not people with the same name.");
	}
    }

    public static void remove(Map<String, String> map, String name) {
	String key = null;
	for (int i = 0; i < map.size(); i++) {
	    if (map.containsValue(name)) {
		for (Entry<String, String> entry : map.entrySet()) {
		    if (entry.getValue().equals(name)) {
			key = entry.getKey();
		    }
		}
	    }
	    map.remove(key);
	}
    }

    public static void main(String[] args) {
	Map<String, String> personMap = new HashMap<String, String>();
	personMap.put("Fedoseev", "Oleksandr");
	personMap.put("Lutsyshyn", "Marian");
	personMap.put("Pylypenko", "Vitalii");
	personMap.put("Melnyk", "Orest");
	personMap.put("Ferens", "Roman");
	personMap.put("Rekrutiv", "Mykhailo");
	personMap.put("Sydorov", "Oleksandr");
	personMap.put("Shabada", "Svitlana");
	personMap.put("Gordienko", "Sofi");
	personMap.put("Sulyk", "Natali");

	System.out.println(personMap);
	Task2.coincidence(personMap);
	Task2.remove(personMap, "Marian");
	System.out.println(personMap);
    }
}
