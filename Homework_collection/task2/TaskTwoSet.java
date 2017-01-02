package task2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TaskTwoSet {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		Collections.addAll(set1, 1, 2, 3, 4);
		Collections.addAll(set2, 2, 3, 5, 7);
		union(set1, set2);
		intersect(set1, set2);
	}

	private static void intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set4 = new HashSet<Integer>();
		for (Integer number : set1) {
			for (Integer numberSet2 : set2) {
				if (number.equals(numberSet2)) {
					set4.add(number);
				}
			}
		}
		System.out.println("IntersectSet = " + set4);

	}

	private static void union(Set<Integer> set1, Set<Integer> set2) {

		{
			Set<Integer> set3 = new HashSet<Integer>();
			set3.addAll(set1);
			set3.addAll(set2);
			// set1.addAll(set2);
			System.out.println("UnionSet = " + set3);
		}
	}
}
