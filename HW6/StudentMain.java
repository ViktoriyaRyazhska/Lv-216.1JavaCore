package homeworks.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of course");
	int number = sc.nextInt();

	List<Student> students = new ArrayList<Student>();
	students.add(new Student("Pylypenko", 3));
	students.add(new Student("Gordienko", 1));
	students.add(new Student("Stefankiv", 2));
	students.add(new Student("Pankiv", 4));
	students.add(new Student("Fedoseev", 3));

	Iterator<Student> iterator = students.iterator();
	Student student = new Student();
	while (iterator.hasNext()) {
	    student = iterator.next();
	    if (student.getCourse() == number) {
		System.out.println("Surname of student(s) " + student.getSurname());
	    }
	}
	
	students.sort(Student.getCourseComparator());
	System.out.println(students);
	students.sort(Student.getNameComparator());
	System.out.println(students);

    }
}
