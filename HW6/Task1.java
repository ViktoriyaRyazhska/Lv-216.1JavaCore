package homeworks.day7;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    
    public static void union(Set<String> set1, Set<String> set2) {
	Set<String> union = new HashSet<String>(set1);
	union.addAll(set2);
	System.out.println("Union " + union);
    }

    public static void intersection(Set<String> set1, Set<String> set2) {
	Set<String> intersection = new HashSet<String>(set1);
	intersection.retainAll(set2);
	System.out.println("Intersection " + intersection);
    }

    public static void main(String[] args) {
	
	Set<String> set1 = new HashSet<String>();
	set1.add("Camaro");
	set1.add("Cruze");
	set1.add("Corvette");
	set1.add("Insignia");
	set1.add("Suburban");
	
	Set<String> set2 = new HashSet<String>();
	set2.add("Vivaro");
	set2.add("Cruze");
	set2.add("Astra");
	set2.add("Insignia");
	set2.add("Omega");

	Task1.union(set1, set2);
	Task1.intersection(set1, set2);
    }

}
