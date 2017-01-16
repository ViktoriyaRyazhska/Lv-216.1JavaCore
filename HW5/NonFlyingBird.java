package homeworks.day6;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, int layEgs) {
	super(feathers, layEgs);
}

@Override
public void fly() {
	System.out.print(" can't fly");
	System.out.println();
}

@Override
public void info() {
	System.out.print("NonFlyingBird extends ");
	super.info();
}
}
