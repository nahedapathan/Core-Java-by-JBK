package collection.linkedlist01;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test01Size {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		System.out.println("L1 size :"+l1.size());
		System.out.println("L1 :"+l1);
		
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add("Hello");
		al1.add(true);
		al1.add(12.34f);
		
		LinkedList l2=new LinkedList<>(al1);
		System.out.println("L2 size :"+l2.size());
		System.out.println("L2 :"+l2);
	}
}
