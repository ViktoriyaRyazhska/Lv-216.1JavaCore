package ua.bilas;

public abstract class Bird {

	private boolean feathers;
	private boolean layEggs;
	
	public Bird(boolean feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public boolean isFeathers() {
		return feathers;
	}

	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setLayEgs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEgs=" + layEggs + "]";
	}
	
	public abstract void fly();
}
