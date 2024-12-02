package collection.linkedlist01;

import java.util.LinkedList;

public class Test05Set {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(101);
		l1.add(102);
		l1.add(103);
		l1.add(104);
		
		System.out.println("L1 :"+l1);
		System.out.println(l1.set(2, 67));
		System.out.println(l1);
	}
}
