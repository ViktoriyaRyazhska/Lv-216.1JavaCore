package HomeWork6;

public abstract class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	
	}

	@Override
	public String toString() {
		return "NonFlyingBird  extend class " + super.toString() + "]";
	}

	
	
}
