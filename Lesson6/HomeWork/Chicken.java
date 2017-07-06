package lesson6.homework;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, int layEgs) {
		super(feathers, layEgs);
	}

	@Override
	public void info() {
		System.out.print("Chicken extends ");
		super.info();
	}
}
