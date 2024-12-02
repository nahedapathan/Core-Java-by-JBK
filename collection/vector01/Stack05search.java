package collection.vector01;

import java.util.Stack;

public class Stack05search {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(101);
		s.push(102);
		s.push("Hello");
		System.out.println(s);
		System.out.println(s.search(101));
		System.out.println(s.search("Hello"));
	}
}
