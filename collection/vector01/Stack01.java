package collection.vector01;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack01 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(101);
		s.add(102);
		s.add(103);
		s.add("Hello");
		s.add(true);
		s.add(10.23);
		s.add(null);
		
		System.out.println("------------------------");
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------");
		ListIterator ltr=s.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("------------------------");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
