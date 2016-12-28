package HomeWork6;

public class Swallow extends FlyingBird {

	public Swallow(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("I am fly");
	}

	@Override
	public String toString() {
		return "Swallow  extend class " + super.toString() + "]";
	}

}
