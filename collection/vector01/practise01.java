package collection.vector01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class practise01 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(105);
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("------------------------");
		ListIterator ltr=v.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("------------------------");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		System.out.println("------------------------");
		Enumeration enm=v.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
