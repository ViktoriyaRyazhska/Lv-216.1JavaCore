package task1;

public class Main {

	public static void main(String[] args) {

		
		Bird[] birdPark = new Bird[5];
		
		Penguin penguin = new Penguin(true, false);
		Swallow swallow = new Swallow(true, true);
		Chicken chicken = new Chicken(true, true);
		Eagl eagl = new Eagl(true, true);
		Kiwi kiwi = new Kiwi(true, false);
		

	
		birdPark[0] = penguin;
		birdPark[1] = swallow;
		birdPark[2] = chicken;
		birdPark[3] = eagl;
		birdPark[4] = kiwi;

		

		for (int i = 0; i < birdPark.length; i++) {
			System.out.print( " I`m "+birdPark[i].getClass().getSimpleName()+" ");
			birdPark[i].fly(); 
			System.out.println();
		}
		
		System.out.println("Whole information");
		for (int i = 0; i < birdPark.length; i++) {
			birdPark[i].getInformation();
			System.out.println();
		}

	}

}
