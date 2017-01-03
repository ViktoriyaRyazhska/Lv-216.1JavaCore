package task1;

public abstract class Bird {

	protected abstract void fly();

	private boolean layEggs;
	private boolean feathers;




	public  void getInformation(){
		System.out.println(getClass().getSimpleName());
		System.out.println("Have reathers :" + isFeathers());
		System.out.println("Lay eggs : " + isLayEggs());
		
	}

	public Bird(boolean aLayEggs, boolean aFeathers) {
		layEggs = aLayEggs;
		feathers = aFeathers;
	}

	public boolean isLayEggs() {
	
		return layEggs;
	}



	public boolean isFeathers() {
		return feathers;
	}

}
