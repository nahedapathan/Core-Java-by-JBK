package collection.linkedlist01;

import java.util.Iterator;
import java.util.LinkedList;

public class Test06DescendingIterator {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		
		Iterator itr=l1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
