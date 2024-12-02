package collection.linkedlist01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practise01 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("10");
		l1.add("Hello");
		l1.add(12.34f);
		l1.add(13.2638);
		l1.add(true);
		l1.add('A');
		l1.add(null);
		System.out.println("l1 :"+l1);
		
		//Traversing eleemnt using iterator
		System.out.println("--------------");
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//List iterator
		System.out.println("Traversing list iterator using list iterator");
		ListIterator ltr=l1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("-----------------");
		System.out.println("Traversing From Back");
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	}
}
