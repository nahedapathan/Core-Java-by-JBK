package collection.TreeSet01;

import java.util.Comparator;

public class StudentName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		if(s1.sname.charAt(0)==s2.sname.charAt(0))
		{
			return 0;
		}
		else if(s1.sname.charAt(0)>s2.sname.charAt(0))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
