package collection.vector01;

import java.util.Stack;

public class Stack02pop {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(101);
		s.push(103);
		s.push("Hello");
		s.push(true);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
	}
}
