package HomeWork7;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public class UnionIntersectTwoSet {
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> setUnion = new HashSet<Integer>();
		for (Integer s : set1) {
			setUnion.add(s);
		}  
		
		for (Integer s : set2) {
			setUnion.add(s);
		} 
		
		return setUnion;
	}
	
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> setIntersect = new HashSet<Integer>();
		for (Integer s : set2) {
			if (set1.contains(s)){
				setIntersect.add(s);
			}
		}
		return setIntersect;
	}
	public static void main(String[] args) {
		Random rand = new Random();	
		
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set1.add(rand.nextInt(20));
		}
		System.out.println("set1: " + set1);
		
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set2.add(rand.nextInt(20));
		}
		System.out.println("set2: " + set2);
		
		Set<Integer> setUnion = new HashSet<Integer>();
		setUnion = union(set1,set2);
		System.out.println("setUnion: " + setUnion);
		
		Set<Integer> setIntersect = new HashSet<Integer>();
		setIntersect = intersect(set1,set2);
		System.out.println("setIntersect: " + setIntersect);
	}

}
