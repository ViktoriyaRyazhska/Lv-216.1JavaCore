package lesson6;

import lesson6.Staff.TYPE_PERSON;

public class RunPerson {

	public static void main(String[] args) {

		Person[] person = new Person[6];

		person[0] = new Teacher(TYPE_PERSON.Teacher, "Ivanenko");
		person[1] = new Teacher(TYPE_PERSON.Teacher, "Petrenko");

		person[2] = new Cleaner(TYPE_PERSON.Cleaner, "Sydorenko");
		person[3] = new Cleaner(TYPE_PERSON.Cleaner, "Tarasenko");

		person[4] = new Student(TYPE_PERSON.Student, "Stepanenko");
		person[5] = new Student(TYPE_PERSON.Student, "Pavlenko");

		for (int i = 0; i < person.length; i++) {
			person[i].print();

		}
		for (int i = 0; i < 4; i++) {
			((Staff) person[i]).salary();

		}
	}

}
