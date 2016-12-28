package lesson6;

public class Cat implements Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat(String name) {
		setName(name);
		System.out.println("Cat name " + getName() + " created");
	}

	@Override
	public void voice() {
		System.out.println(getName() + " says 'may, may...'");

	}

	@Override
	public void feed() {
		System.out.println("I'm feeding cat " + getName());

	}

}
