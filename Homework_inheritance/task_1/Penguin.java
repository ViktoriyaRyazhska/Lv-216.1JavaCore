package task_1;

public class Penguin extends NonFlyingBird {
	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);

	}

	public void fly() {
		System.out.println("Penguin don't fly");
	}

	@Override
	public String toString() {
		return "Penguin [feathers=" + getFeathers() + ", layEggs=" + isLayEggs() + "]";
	}
}
