package task_1;

public class Swallow extends FlyingBird {
	public Swallow(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);

	}

	public void fly() {
		System.out.println("Swallow fly ");
	}

	@Override
	public String toString() {
		return "Swallow [feathers=" + getFeathers() + ", layEggs=" + isLayEggs() + "]";
	}
}
