package collection.TreeSet01;

import java.util.Iterator;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new Student(101,"Vivek","noida",89));
		t.add(new Student(102,"Rahul","Delhi",78));
		t.add(new Student(103,"Neha","Kanpur",123));
		
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
