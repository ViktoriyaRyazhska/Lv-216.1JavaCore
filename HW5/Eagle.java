package homeworks.day6;


    public class Eagle extends FlyingBird {

	public Eagle(String feathers, int layEgs) {
		super(feathers, layEgs);
	}

	@Override
	public void info() {
		System.out.print("Eagle extends ");
		super.info();
	}

}

