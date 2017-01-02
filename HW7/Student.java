package ua.bilas;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private Integer course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public Student(String name, Integer course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public void printStudents(List<Student> students, Integer course) {

		Iterator<Student> iterator = students.iterator();
		
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			if (student.getCourse().equals(course)) {
				System.out.println("Student:" + student.getName());
			}
			
		}
	}

	public static Comparator<Student> compareByName() {
		
		NameCompare compare = new NameCompare();
		
		return  compare;
	}

	public static Comparator<Student> compareByCourse() {
		
		CourseCompare compare = new CourseCompare();
		
		return compare;

		
	}
}
