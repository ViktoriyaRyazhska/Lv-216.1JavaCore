package homework7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	String name;
	int course;
	
	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	public Student() {
		super();
	}

	public void printStudents(List students,int course){
		Iterator<List> it = students.iterator();
		Student stud = new Student();
		while (it.hasNext()) {
			stud = (Student) it.next();
			if (stud.course == course){
				System.out.println(stud);
			}
		}
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
	
    static NameComparator nameComparator = new NameComparator( );
    static CourseComparator courseComparator = new CourseComparator();
    
	public static Comparator getNameComparator( ) {
        return nameComparator;
    }
	
	public static Comparator getCourseComparator( ) {
        return courseComparator;
	}

}
