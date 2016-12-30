package ua.bilas;

public class NonFlyingBird extends Bird{


	public NonFlyingBird(boolean feathers, boolean layEggs) {
		// TODO Auto-generated constructor stub
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't fly!");
	}

	
}
