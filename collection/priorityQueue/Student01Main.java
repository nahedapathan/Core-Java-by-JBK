package collection.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Student01Main {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(new StudentMarksDescending());
		pq.add(new Student(101,"Vivek","Noida",45));
		pq.add(new Student(102,"Amit","Delhi",90));
		pq.add(new Student(103,"Rahul","Nagpur",562));
		
		
		Iterator itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
