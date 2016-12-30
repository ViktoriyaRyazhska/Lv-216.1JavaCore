package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Collection {
	/*
	 * Declare collection myCollection of 10 integers and fill it (from the
	 * console or random). Find and save in list newCollection all positions of
	 * element more than 5 in the collection. Print newCollection Remove from
	 * collection myCollection elements, which are greater then 20. Print result
	 * Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the
	 * format: “position – xxx, value of element – xxx” Sort and print
	 * collection
	 * 
	 * Use next Collections for this tasks: List, ArrayList, LinkedList
	 */
	public static void main(String[] args) {

		Random rand = new Random();

		List<Integer> myCollection = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			myCollection.add(rand.nextInt(30));
		}
		System.out.println("myCollection vol.1" + "\t" + myCollection);

		List<Integer> newCollection = new LinkedList<Integer>();

		Iterator<Integer> iterator = myCollection.iterator();

		// find and save in list newCollection all positions of element more
		// than 5 in the collection
		while (iterator.hasNext()) {
			Integer el = iterator.next();
			if (el > 5) {
				newCollection.add(el);
			}
		}
		System.out.println("newCollection vol.1" + "\t" + newCollection);

		// print newCollection Remove from collection myCollection elements,
		// which are greater then 20
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;
			}
		}
		System.out.println("myCollection vol.2" + "\t" + myCollection);

		// Print result Insert elements 1, -3, -4 in positions 2, 8, 5. Print
		// result in the format: “position – xxx, value of element – xxx”
		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		System.out.println("myCollection vol.3");
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("position - " + i + "\t" + ", value of element - " + myCollection.get(i));
		}

		// Sort and print collection
		Collections.sort(myCollection);
		System.out.println("myCollection vol.4" + "\t" + myCollection);
	}

}
