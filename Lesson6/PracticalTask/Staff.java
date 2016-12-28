package lesson6;

public abstract class Staff extends Person {

	enum TYPE_PERSON {
		Teacher, Cleaner, Student
	}

	public Staff(TYPE_PERSON type) {

	}

	@Override
	public void print() {
		System.out.print("I am a ");

	}
	
	public abstract void salary();

}
