package collection.linkedlist01;

import java.util.Iterator;
import java.util.LinkedList;

public class Test03iterator {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		l1.add(104);
		l1.add(105);
		System.out.println(l1);
		
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
}
