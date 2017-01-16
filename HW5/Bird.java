package homeworks.day6;

public abstract class Bird {
    private String feathers;
    private int layEgs;

    public Bird(String feathers, int layEgs) {
	this.feathers = feathers;
	this.layEgs = layEgs;
    }

    public abstract void fly();

    public void info() {
	System.out.print("Bird feathers " + this.feathers + ", layEgs " + this.layEgs);
    }

}
