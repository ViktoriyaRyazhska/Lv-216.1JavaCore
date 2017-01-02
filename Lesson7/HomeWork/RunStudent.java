package lesson7;

import java.util.ArrayList;
import java.util.List;

public class RunStudent {
	/*
	 * In the main() method declare List students and add to the list five
	 * different students display the list of students ordered by name display
	 * the list of students ordered by course.
	 */

	public static void main(String[] args) {
		
		Student st = new Student();
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ivanenko", 4));
		students.add(new Student("Petrenko", 2));
		students.add(new Student("Sydorenko", 1));
		students.add(new Student("Pavlenko", 4));
		students.add(new Student("Semenenko", 2));
		
		st.printStudents(students, 2);
		students.sort(Student.getCourceComparator());
		System.out.println(students);
		students.sort(Student.getNameComparator());
		System.out.println(students);

	}

}
