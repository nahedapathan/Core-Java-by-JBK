package collection.vector01;

import java.util.Stack;

public class Stack04empty {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(101);
		s.push(102);
		s.push(103);
		s.push("Hello");
		System.out.println(s.empty());
		s.clear();
		System.out.println(s.empty());
	}
}
