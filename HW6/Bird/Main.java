package ua.bilas;

public class Main {

	public static void main(String[] args) {
		
		Bird[] birds = new Bird[4];
		
		birds[0] = new Eagle(true, true);
		birds[1] = new Swallow(true, false);
		birds[2] = new Penguin(false, true);
		birds[3] = new Chicken(true, true);
		
		for (Bird bird : birds) {
			bird.fly();
		}
		
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
}
