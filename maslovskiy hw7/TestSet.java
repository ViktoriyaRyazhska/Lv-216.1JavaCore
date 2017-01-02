package homework7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Random r = new Random();
		Set<Integer> s1 = new HashSet();
		Set<Integer> s2 = new HashSet();
		set(s1,r);
		set(s2,r);
		out(s1);
		System.out.println();
		out(s2);
		System.out.println();
		union(s1,s2);
		System.out.println();
		intersect(s1,s2);
	}

	private static void intersect(Set<Integer> s1, Set<Integer> s2) {
		Set<Integer> Intersect = new HashSet();
		for(Integer i: s1){
			if(s2.contains(i)){
				Intersect.add(i);
			}
		}
		for(Integer i: s2){
			if(s1.contains(i)){
				Intersect.add(i);
			}
		}
		System.out.println("Intersect : " + Intersect);
	}

	private static void out(Set<Integer> s) {
		for(Integer i: s){
			System.out.print(i + " ");
		}
		
	}

	private static void set(Set<Integer> s1, Random r) {
		int i = 0;
		while(i < 10 ){
				s1.add(r.nextInt(20));
				i++;
		}
		
	}

	private static void union(Set<Integer> s1, Set<Integer> s2) {
		Set<Integer> Union = new HashSet();
		for(Integer i:s1){
			Union.add(i);
		}
		for(Integer i:s2){
			Union.add(i);
		}
		System.out.println("Union : "+Union);
		
	}

}
