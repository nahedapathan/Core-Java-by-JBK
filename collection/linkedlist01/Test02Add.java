package collection.linkedlist01;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test02Add {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("E1");
		l1.add("E2");
		
		ArrayList al1=new ArrayList();
		al1.add("Hello");
		al1.add(102);
		al1.add(true);
		
		l1.addAll(al1);
		System.out.println("l1 :"+l1);
	}
}
