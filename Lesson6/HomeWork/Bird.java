package lesson6.homework;

public abstract class Bird {
	/*
	 * Develop abstract class Bird with attributes feathers and layEggs and an
	 * abstract method fly().  Develop classes FlyingBird and NonFlyingBird.
	 * Create class Eagle, Swallow, Penguin and Chicken. Create array Bird and
	 * add different birds to it. Call fly() method for all of it. Output the
	 * information about each type of created bird.
	 */

	//attributes feathers and layEggs
	private String feathers;
	private int layEgs;

	// constructor
	public Bird(String feathers, int layEgs) {
		this.feathers = feathers;
		this.layEgs = layEgs;
	}
	
	// abstarct method fly()
	public abstract void fly();
		
	// info output method
	public void info(){
		System.out.print("Bird [ feathers " + this.feathers + ", layEgs " + this.layEgs);
	}

}
