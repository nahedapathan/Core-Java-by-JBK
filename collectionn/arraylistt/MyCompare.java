package collectionn.arraylistt;

import java.util.Comparator;

public class MyCompare implements Comparator <Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.sid>s2.sid)
		{
			return 1;
		}
		else if(s1.sid==s2.sid)
		{
			return 0;
		}
		else
		{
			return -1;
		}
		
	}

}
