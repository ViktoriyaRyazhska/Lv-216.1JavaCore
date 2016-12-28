package task_1;

public class Eagle extends FlyingBird {
	public Eagle(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);

	}

	public void fly() {
		System.out.println("Eagle fly");
	}

	@Override
	public String toString() {
		return "Eagle [feathers=" + getFeathers() + ", layEggs=" + isLayEggs() + "]";
	}
}
