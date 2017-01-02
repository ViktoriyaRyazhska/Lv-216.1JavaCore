package homework7;

import java.util.Comparator;

public class CourseComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Student)o2).getCourse() - ((Student)o1).getCourse();
	}
	
}
