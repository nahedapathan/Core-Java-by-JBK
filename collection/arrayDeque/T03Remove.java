package collection.arrayDeque;

import java.util.ArrayDeque;

public class T03Remove {

	public static void main(String[] args) {
		ArrayDeque<String> animals=new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		System.out.println("AD: "+animals);
		
		System.out.println("-----------------------");
		animals.remove();
		
		System.out.println("AD: "+animals);
		
		
		//removeFirst()
		System.out.println("-----------------------");
		animals.removeFirst();
		
		System.out.println("AD: "+animals);
		
		//RemoveLast
		System.out.println("-----------------------");
		animals.removeLast();
		
		System.out.println("AD: "+animals);
		//----------------------------------------------------------------
		
		//pop method
		ArrayDeque<String> animal1=new ArrayDeque<>();
		animal1.add("Dog");
		animal1.add("Cat");
		animal1.add("Cow");
		animal1.add("Horse");
		
		System.out.println("------AnotherMrthod-----------------");

		System.out.println("AD: "+animal1);
		
		//using poll
		System.out.println("-----------------------");
		animal1.poll();
				
		System.out.println("AD: "+animal1);
		
		//using poll
		System.out.println("-----------------------");
		animal1.pollFirst();
				
		System.out.println("AD: "+animal1);
		
		
		//using poll
		System.out.println("-----------------------");
		animal1.pollLast();
				
		System.out.println("AD: "+animal1);
		
		
		
		
		
		
		
	}
}
