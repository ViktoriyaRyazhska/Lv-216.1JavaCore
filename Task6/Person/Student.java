package ua.bilas2;

public class Student extends Person{
	
	final String TYPE_PERSON = "Student";

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println(TYPE_PERSON);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " I am a " + TYPE_PERSON);
		
		
	}

	
	
	
}
