package homeworks.day6;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, int layEgs) {
	super(feathers, layEgs);
    }

    @Override
    public void fly() {
	System.out.print(" can fly");
	System.out.println();
    }

    @Override
    public void info() {
	System.out.print("FlyingBird extends ");
	super.info();
    }
}
