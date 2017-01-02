package lesson7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	/*
	 * Write class Student that provides information about the name of the
	 * student and his course. Class Student should consists of properties for
	 * access to these fields constructor with parameters method printStudents
	 * (List students, Integer course), which receives a list of students and
	 * the course number and prints to the console the names of the students
	 * from the list, which are taught in this course (use an iterator). Methods
	 * to compare students by name and by course. In the main() method declare
	 * List students and add to the list five different students display the
	 * list of students ordered by name display the list of students ordered by
	 * course.
	 */

	private String name;
	private int cource;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCource() {
		return cource;
	}

	public void setCource(int cource) {
		this.cource = cource;
	}

	public Student() {
	}

	public Student(String name, int cource) {
		setName(name);
		setCource(cource);
	}

	@Override
	public String toString() {
		return "Student [name " + getName() + " cource " + getCource() + "]";

	}

	// method printStudents (List students, Integer course), which receives a
	// list of students and the course number and prints to the console the
	// names of the students from the list, which are taught in this course (use
	// an iterator).
	public void printStudents(List<Student> listOfStudent, Integer cource) {
		Iterator<Student> iterator = listOfStudent.iterator();
		Student student = new Student();
		System.out.println("List of students taught at course " + cource);
		while (iterator.hasNext()) {
			student = iterator.next();
			if (student.getCource() == cource) {
				System.out.println("Name of student : " + student.getName());
			}
		}
	}

	// methods to compare students by name and by course.

	static class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Student) o1).name.compareTo(((Student) o2).name);
		}
	}

	static class CourceComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			return ((Student) o1).getCource() - ((Student) o2).getCource();
		}
	}

	static NameComparator nameComparator = new NameComparator();

	static CourceComparator courceComparator = new CourceComparator();

	public static Comparator getNameComparator() {
		return nameComparator;
	}

	public static Comparator getCourceComparator() {
		return courceComparator;
	}

}
