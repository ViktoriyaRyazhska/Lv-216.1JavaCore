package HomeWork6;

public class RunBird {

	public static void main(String[] args) {
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("Black and white", 12);
		birds[1] = new Swallow("Black and white", 10);
		birds[2] = new Penguin("Black and white", 1);
		birds[3] = new Chicken("All colors", 150);
		
		for (int i = 0; i < birds.length; i++) {
			
			System.out.println(birds[i]);
			birds[i].fly();
			
		}
		

	}

}
