package HomeWork6;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, int layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("I am not fly");

	}

	@Override
	public String toString() {
		return "Chicken  extend class " + super.toString() + "]";
	}

}
