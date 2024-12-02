package collection.TreeSet01;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
		//Creating TreeSet with a comparator which stores the element on the basis of Student marks comparator
		TreeSet t=new TreeSet(new StudentMarks());
		t.add(new Student(101,"Vivek","Noida",89));
		t.add(new Student(102,"Rahul","Delhi",78));
		t.add(new Student(103,"Kunal","Kanpur",123));
		t.add(new Student(104,"Amit","Nagpur",789));
		
		System.out.println("Order Student Marks");
		Iterator itr=t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Create treeset student name Comparator
		TreeSet t2=new TreeSet(new StudentName());
		t2.add(new Student(101,"Vivek","Noida",89));
		t2.add(new Student(102,"Rahul","Delhi",78));
		t2.add(new Student(103,"Kunal","Kanpur",123));
		t2.add(new Student(104,"Amit","Nagpur",789));
		
		System.out.println("Student name-------------------------");
		Iterator itr2=t2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
