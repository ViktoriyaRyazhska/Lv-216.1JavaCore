package homework7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Vova",4));
		students.add(new Student("Andriy",3));
		students.add(new Student("Oleg",1));
		students.add(new Student("Ivan",5));
		students.add(new Student("Vasyl",4));
		
//		sortByCourse(students);
//		sortByName(students);
		Collections.sort(students,Student.courseComparator);
		for(Student emp: students ){
			System.out.println(" Name : " + emp.getName() + " Course : " + emp.getCourse());
			
		}
		System.out.println();
		Collections.sort(students,Student.nameComparator);
		for(Student emp: students ){
			System.out.println(" Name : " + emp.getName() + " Course : " + emp.getCourse());
			
		}
		
	}
//	private static void sortByName(List<Student> students) {
//	
//		
//		Collections.sort(students,(new Comparator<Student>() {
//	         @Override
//	        public int compare(Student e1, Student e2) {
//
//	                return ((Student)e1).getName().compareTo(((Student)e2).getName());
//	        }
//	    }
//		));
//		for(Student emp: students ){
//			System.out.println(" Name : " + emp.getName() + " Course : " + emp.getCourse());
//			
//		}
//		
//	}
	
//	private static void sortByCourse(List<Student> mapa) {
//		
//		Collections.sort(mapa,(new Comparator<Student>() {
//	         @Override
//	        public int compare(Student e1, Student e2) {
//
//	                return ((Student)e2).getCourse() - ((Student)e1).getCourse();
//	        }
//	    }
//		));
//		for(Student emp: mapa ){
//			System.out.println(" Name : " + emp.getName() + " Course : " + emp.getCourse());
//			
//		}
//	}

}
