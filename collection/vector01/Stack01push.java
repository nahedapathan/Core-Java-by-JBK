package collection.vector01;

import java.util.Stack;

public class Stack01push {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(101);
		s.push(102);
		s.push("Hello");
		s.push(true);
		s.push(12.34);
		System.out.println(s);
	}
}
