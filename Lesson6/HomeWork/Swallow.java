package lesson6.homework;

public class Swallow extends FlyingBird {
	
	public Swallow(String feathers, int layEgs) {
		super(feathers, layEgs);
	}
	
	@Override
	public void info() {
		System.out.print("Swallow extends ");
		super.info();
	}

}
