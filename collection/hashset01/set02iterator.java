package collection.hashset01;

import java.util.HashSet;
import java.util.Iterator;

public class set02iterator {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(101);
		set.add("Hello");
		set.add('A');
		set.add(null);
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
