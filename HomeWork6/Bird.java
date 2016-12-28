package HomeWork6;

public abstract class Bird {
	private String feathers;
	private int layEggs;
	
	public Bird(String feathers, int layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract void fly();

	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	

}
