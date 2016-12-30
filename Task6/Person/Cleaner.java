package ua.bilas2;

public class Cleaner extends Staff{

	final String TYPE_PERSON = "Cleaner";
	
	public Cleaner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println(TYPE_PERSON);
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " my salary is 3200");
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " I am a " + TYPE_PERSON);
	}

}
