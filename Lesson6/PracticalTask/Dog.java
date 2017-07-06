package lesson6;

public class Dog implements Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name) {
		setName(name);
		System.out.println("Dog name " + getName() + " created");
	}

	@Override
	public void voice() {
		System.out.println(getName() + " says 'woof, woof...'");

	}

	@Override
	public void feed() {
		System.out.println("I'm feeding dog " + getName());

	}
}