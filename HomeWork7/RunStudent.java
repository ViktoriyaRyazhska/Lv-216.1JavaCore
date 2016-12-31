package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class RunStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ivan", 4));
		students.add(new Student("Petro", 1));
		students.add(new Student("Olha", 4));
		students.add(new Student("Taras", 2));
		students.add(new Student("Oleg", 3));
		
		students.sort(Student.getNameComparator());
		System.out.println(students);
		students.sort(Student.getCourseComparator());
		System.out.println(students);
		
		Student.printStudents(students, 4);
	}

}
