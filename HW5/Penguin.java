package homeworks.day6;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, int layEgs) {
	super(feathers, layEgs);
    }

    @Override
    public void info() {
	System.out.print("Penguin extends ");
	super.info();
    }
}
