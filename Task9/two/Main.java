package ua.bilas2;

public class Main {

	public static void main(String[] args) {

		Plants[] plants = new Plants[5];
		try {

			plants[0] = new Plants("tree", "green", 5);
			plants[1] = new Plants("bush", "green", 3);
			plants[2] = new Plants("flower", "green", 1);
			plants[3] = new Plants("flowe", "blue", 2);
			plants[4] = new Plants("tree", "green", 6);

			System.out.println("what is goin on?");

		} catch (ColorException | TypeException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
			e.printStackTrace();
		} 
		
		for (Plants plants2 : plants) {
			System.out.println(plants2);
		}
	}
}
