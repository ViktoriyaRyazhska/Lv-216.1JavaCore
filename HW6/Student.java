package homeworks.day7;

import java.util.Comparator;

public class Student {
    private String Surname;
    private int cource;

    public String getSurname() {
	return Surname;
    }

    public void setName(String Surname) {
	this.Surname = Surname;
    }

    public int getCourse() {
	return cource;
    }

    public void setCourse(int cource) {
	this.cource = cource;
    }
    public Student() {
	 	}

    public Student(String Surname, int cource) {
	this.Surname = Surname;
	this.cource = cource;
    }

    @Override
    public String toString() {
	return "Student [Surname=" + Surname + ", cource=" + cource + "]";
    }

    static class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
	    return ((Student) o1).Surname.compareTo(((Student) o2).Surname);
	}
    }

    static class CourseComparator implements Comparator {
	public int compare(Object o1, Object o2) {
	    return ((Student) o1).getCourse() - ((Student) o2).getCourse();
	}
    }

    static NameComparator nameComparator = new NameComparator();

    static CourseComparator courceComparator = new CourseComparator();

    public static Comparator getNameComparator() {
	return nameComparator;
    }

    public static Comparator getCourseComparator() {
	return courceComparator;
    }

}
