package HomeWork6;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public String toString() {
		return "Penguin  extend class " + super.toString() + "]";
	}

	@Override
	public void fly() {
		System.out.println("I am not fly");

	}

}
