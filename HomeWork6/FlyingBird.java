package HomeWork6;

public abstract class FlyingBird extends Bird{

	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public String toString() {
		return "FlyingBird  extend class " + super.toString() + "]";
	}

	

}
