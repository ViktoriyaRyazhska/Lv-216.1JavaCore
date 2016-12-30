package ua.bilas;

public class FlyingBird extends Bird{
	
	
	public FlyingBird() {
		// TODO Auto-generated constructor stub
	}

	public FlyingBird(boolean feathers, boolean layEggs) {
		// TODO Auto-generated constructor stub
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can fly!");
	}

}
