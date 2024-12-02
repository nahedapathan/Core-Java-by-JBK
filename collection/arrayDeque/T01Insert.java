package collection.arrayDeque;

import java.util.ArrayDeque;

public class T01Insert {

	public static void main(String[] args) {
		ArrayDeque<String> animals=new ArrayDeque<>();
		animals.add("Dog");
		
		animals.addFirst("Cat");
		
		animals.addLast("Horse");
		
		System.out.println("AD : "+animals);
		
		
		//another Method
		ArrayDeque animals1=new ArrayDeque();
		animals1.offer("Dog");
		animals1.offerFirst("Cat");
		animals1.offerLast("Horse");
		
		System.out.println("AD: "+animals1);
	}
}
