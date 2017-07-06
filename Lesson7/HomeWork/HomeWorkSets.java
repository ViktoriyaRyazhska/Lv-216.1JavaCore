package lesson7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HomeWorkSets {

	/*
	 * Write parameterized methods union(Set set1, Set set2) and intersect(Set
	 * set1, Set set2), realizing the operations of union and intersection of
	 * two sets. Test the operation of these techniques on two pre-filled sets.
	 */

	public static void union(Set<String> set1, Set<String> set2) {
		Set<String> union = new TreeSet<String>(set1);
		union.addAll(set2);
		System.out.println("Union " + "\t" + union);
	}

	public static void intersect(Set<String> set1, Set<String> set2) {
		Set<String> intersect = new TreeSet<String>(set1);
		intersect.retainAll(set2);
		System.out.println("Intersection " + "\t" + intersect);
	}

	public static void main(String[] args) {
		Set<String> animal = new HashSet<>();
		animal.add("wolf");
		animal.add("penguin");
		animal.add("ram");
		animal.add("bunny");
		animal.add("cat");

		Set<String> creature = new LinkedHashSet<>();
		creature.add("fish");
		creature.add("bird");
		creature.add("reptile");
		creature.add("penguin");
		creature.add("ram");

		HomeWorkSets.union(animal, creature);

		HomeWorkSets.intersect(animal, creature);

	}

}
