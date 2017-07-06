package lesson6;

public class Student extends Staff {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(TYPE_PERSON type, String name) {
		super(type);
		setName(name);
		System.out.println(type + " name " + getName() + " created...");
	}

	@Override
	public void print() {
		super.print();
		System.out.println(TYPE_PERSON.Student + " and my name is " + getName());

	}

	@Override
	public void salary() {
		System.out.println(TYPE_PERSON.Student + " " + getName() + " don't get a salary");
	}

}
