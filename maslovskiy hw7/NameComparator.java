package homework7;

import java.util.Comparator;

public class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((Student)o1).name.compareTo(((Student)o2).name);
	}
	


}
