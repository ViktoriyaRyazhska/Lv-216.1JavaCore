package ua.bilas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> myCollection = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			myCollection.add((int) (Math.random() * 100));
		}
		
		for (Integer integer : myCollection) {
			System.out.print(integer + " ");
		}
		
		List<Integer> newCollection = new ArrayList<>();
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(myCollection.get(i));
			}
		}
		
		System.out.println();
		
		for (Integer integer : newCollection) {
			System.out.print(integer + " ");
		}
		
		Iterator<Integer> iterator = myCollection.iterator();
		
		while (iterator.hasNext()) {
			
			if (iterator.next() > 20) {
				iterator.remove();
			}
		}
		
		System.out.println();
		
		for (Integer integer : myCollection) {
			System.out.print(integer + " ");
		}
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("add position:");
			int index = scanner.nextInt() - 1;
			System.out.println("add element:");
			int element = scanner.nextInt();
			newCollection.add(index, element);
			
		}
//		myCollection.add(7, -3);
//		myCollection.add(4, -4);
		
		Iterator<Integer> iterator2 = newCollection.iterator();
		
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
			
		}
		System.out.println();
		
		Collections.sort(newCollection);
		System.out.println("sored collection \n " + newCollection);
		scanner.close();
	}
}
