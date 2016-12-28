package HomeWork6;

public class Eagle extends FlyingBird{

	public Eagle(String feathers, int layEggs) {
		super(feathers, layEggs);
		
	}

	@Override
	public void fly() {
		System.out.println("I am fly");
		
	}

	@Override
	public String toString() {
		return "Eagle extend class " + super.toString() + "]";
	}

	
	
}
