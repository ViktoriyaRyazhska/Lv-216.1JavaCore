package lesson6.homework;

public class RunBird {

	public static void main(String[] args) {
		/*
		 * Create array Bird and add different birds to it. Call fly() method //
		 * for all of it. Output the information about each type of created bird
		 */
		
		Bird[] bird = new Bird[4];
		bird[0] = new Eagle("Gray/Brown/Black", 0);
		bird[1] = new Swallow("Black/White", 8);
		bird[2] = new Penguin("Black/White/Yellow", 15);
		bird[3] = new Chicken("Gray/Brown/Red", 54);
		
		for (int i = 0; i < bird.length; i++) {
			bird[i].info();
			bird[i].fly();
		}

	}

}
