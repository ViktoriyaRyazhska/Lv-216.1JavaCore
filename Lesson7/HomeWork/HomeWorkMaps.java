package lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HomeWorkMaps {
	/*
	 * Create map personMap and add to it ten persons of type <String, String>
	 * (lastName, firstName). Output the entities of the map on the screen.
	 * There are at less two persons with the same firstName among these 10
	 * people? Remove from the map person whose firstName is ”Ivan” (or other).
	 * Print result.
	 */

	public static void removeName(Map<String, String> map, String name) {
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
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void sameName(Map<String, String> map) {

		for (Entry<String, String> entry : map.entrySet()) {
			String name = entry.getValue();
			int count = 0;
			for (Entry<String, String> entry1 : map.entrySet()) {
				if (name.equals(entry1.getValue())) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("Name " + name + " meets " + count + " temes");
			}
		}
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Ivanenko", "Ivan");
		map.put("Petrenko", "Petro");
		map.put("Sydorenko", "Stepan");
		map.put("Stepanenko", "Anton");
		map.put("Tarasenko", "Orest");
		map.put("Pavlenko", "Igor");
		map.put("Vasylenko", "Semen");
		map.put("Dmytrenko", "Ivan");
		map.put("Sergienko", "Ivan");
		map.put("Semenenko", "Petro");

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		HomeWorkMaps.sameName(map);

		HomeWorkMaps.removeName(map, "Ivan");

	}

}
