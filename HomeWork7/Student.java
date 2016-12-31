package HomeWork7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private int course;
	
	public Student() {
		
	}
	public Student(String name, int course) {
		
		this.name = name;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	
	
	public static void printStudents(List students, int course){
		Iterator<List> iter = students.iterator();
		Student stud = new Student();
		while (iter.hasNext()) {
			stud = (Student) iter.next();
			if (stud.course == course){
				System.out.println(stud);
			}
		}
		
	}
	
	static NameComparator nameComparator = new NameComparator( );
	static CourseComparator courseComparator = new CourseComparator();

	public static Comparator getNameComparator( ) {
        return nameComparator;
    }
	
	public static Comparator getCourseComparator( ) {
        return courseComparator;
	}

	static class NameComparator implements Comparator {
		  public int compare(Object o1, Object o2) {
		    return ((Student)o1).name.compareTo(((Student)o2).name);
		  }
		}
	
	static class CourseComparator implements Comparator {
		  public int compare(Object o1, Object o2) {
		    return ((Student)o1).getCourse() - ((Student)o2).getCourse();
		  }
		}
	

}
