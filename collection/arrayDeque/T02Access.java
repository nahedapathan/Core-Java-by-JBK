package collection.arrayDeque;

import java.util.ArrayDeque;

public class T02Access {

	public static void main(String[] args) {
		ArrayDeque<String> animal=new ArrayDeque();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Horse");
		System.out.println("AD: "+animal);
		
		//Get First Element
		String firstElement=animal.getFirst();
		System.out.println("FirstElement :"+firstElement);
		
		//Get Last Element
		String lastElement=animal.getLast();
		System.out.println("Last Element: "+lastElement);
		
		System.out.println("------------------");
		//Another Method
		ArrayDeque<String> animal1=new ArrayDeque<>();
		animal1.add("Dog");
		animal1.add("Cat");
		animal1.add("Horse");
		
		
		System.out.println("Head Element: "+animal1.peek());
		
		System.out.println("First Element: "+animal1.peekFirst());
		
		System.out.println("Last Element: "+animal1.peekLast());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
