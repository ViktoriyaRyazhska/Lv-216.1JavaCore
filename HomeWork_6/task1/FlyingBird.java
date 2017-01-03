package task1;

public  abstract class   FlyingBird  extends Bird{

	
	
	public FlyingBird(boolean aLayEggs, boolean aFeathers) {
		super(aLayEggs, aFeathers);
		
	}
	
	@Override
	protected void fly() {
		System.out.println("I can fly");
		
	}

	

}
