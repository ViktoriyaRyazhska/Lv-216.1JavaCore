package ua.bilas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Integer> integers = new TreeSet<>();
		
		for (int i = 1; i <= 10; i++) {
			integers.add(i);
		}
		
		Set<Integer> integers2 = new TreeSet<>();
		
		for (int i = 1; i <= 20; i++) {
			integers2.add(i);
		}
		
		Set<Integer> integerUnion = new TreeSet<>();
		
		integerUnion = Main.union(integers, integers2);
		
		Set<Integer> integerIntersect = new TreeSet<>();
		
		integerIntersect = Main.intersect(integers, integers2);
		
		for (Integer integer : integerUnion) {
			System.out.println("union " + integer);
		}
		
		for (Integer integer : integerIntersect) {
			System.out.println("intersect " + integer);
		}
		
		
//		___________________________________________________________
		
		
		Map<String, String> personMap = new TreeMap<>();
		
		personMap.put("ivan", "bobo");
		personMap.put("igor", "hoho");
		personMap.put("ira", "lolo");
		personMap.put("ola", "tutu");
		personMap.put("inna", "mala");
		personMap.put("anna", "huhu");
		personMap.put("oleg", "didi");
		personMap.put("tolik", "koko");
		personMap.put("orest", "kuku");
		personMap.put("sanja", "sisi");
		
		for (Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		
		int count = 0;
		String name = null;
		for (Entry<String, String> entry : personMap.entrySet()) {
			name = entry.getValue();
		}
		
		for (Entry<String, String> entry : personMap.entrySet()) {

			if (name.equals(entry.getValue())) {
				count++;
			}
			
		}
		
		
		System.out.println("there is " + (count - 1) + " people with the same name.");
		
		System.out.println();

		
		String key = "";
		for (Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue().equals("kuku")) {
				key = entry.getKey();
			}
		}
		personMap.remove(key);
		
		for (Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
//		____________________________________________________________________________________
		
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("igor", 25));
		list.add(new Student("ivan", 24));
		list.add(new Student("oleg", 12));
		list.add(new Student("ola", 13));
		list.add(new Student("anna", 14));
		
		list.sort(Student.compareByName());
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println();
		list.sort(Student.compareByCourse());
		
		for (Student student : list) {
			System.out.println(student);
		}
	}

	
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {

		Set<Integer> set = new TreeSet<>();

		set.addAll(set1);
		set.addAll(set2);

		return set;

	}
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set = new TreeSet<>();
		
		set.addAll(set1);
		set.retainAll(set2);
		
		return set;
		
	}
	
	public static void removeElement() {
		
	}
}
