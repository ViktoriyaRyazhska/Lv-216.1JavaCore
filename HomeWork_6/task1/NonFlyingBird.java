package task1;

public abstract class NonFlyingBird extends Bird {

	

	public NonFlyingBird(boolean aLayEggs, boolean aFeathers) {
		super(aLayEggs, aFeathers);
		
	}

	@Override
	protected final void fly() {
		
		System.out.println("I can`t fly");
		
	}

}
