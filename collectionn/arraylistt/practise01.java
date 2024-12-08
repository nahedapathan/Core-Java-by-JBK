package collectionn.arraylistt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class practise01 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		
		//arraylist is storing the elements in adding order
		al1.add(101);
		al1.add(102);
		al1.add(103);
		al1.add(104);
		al1.add(105);
		al1.add(101);
		System.out.println("al1 : "+al1);
		
		//we are accessing the element of an arraylist using the index
		System.out.println("---------------------------");
		for(int i=0;i<=al1.size()-1;i++)
		{
			System.out.println("Index :"+i+"| value "+al1.get(i));
		}
		
		//Traversing array List using iterator 
		System.out.println("-------------------");
		Iterator iterator=al1.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+" ");
		}
		
		
		//Traversing using ListIterator
		ListIterator listIterator=al1.listIterator();
		System.out.println("In Forward Order ");
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
		//List Iterator in perivous Order
		System.out.println("In Reverse Order");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
		}
		
		//Creating Clone In ArrayList
		ArrayList clone=(ArrayList)al1.clone();
		System.out.println("Original ArrayList"+al1);
		System.out.println("Clone ArrayList"+clone);
		
	}
}
