package collection.arrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class T04Iterator {

	public static void main(String[] args) {
		ArrayDeque<String> animal=new ArrayDeque<>();
		
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Horse");
		
		System.out.println("ArrayDeque :"+animal);
		
		Iterator itr=animal.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator itr1=animal.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	}
}
