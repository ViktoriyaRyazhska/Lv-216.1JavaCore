package lesson6.homework;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, int layEgs) {
		super(feathers, layEgs);
	}

	@Override
	public void fly() {
		System.out.print(", I believe I can fly, but I can't ]");
		System.out.println();
	}

	@Override
	public void info() {
		System.out.print("NonFlyingBird extends ");
		super.info();
	}
}
