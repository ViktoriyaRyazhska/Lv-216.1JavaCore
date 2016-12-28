package task_1;

public class Chicken extends NonFlyingBird{
	public Chicken(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
		
	}

	public void fly() {
		System.out.println("Chicken don't fly");
	}
	@Override
	public String toString() {
		return "Chicken [feathers=" + getFeathers() + ", layEggs=" + isLayEggs() + "]";
	}
}

