package collection.hashset01;

import java.util.ArrayList;
import java.util.HashSet;

public class set01add {

	public static void main(String[] args) {
		HashSet set1=new HashSet();
		System.out.println("Size :"+set1.size());
		System.out.println(set1);
		
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(true);
		al1.add(12.34);
		al1.add("Hello");
		System.out.println("Al1 :"+al1);
		
		HashSet set2=new HashSet<>(al1);
		System.out.println("Size :"+set2.size());
		System.out.println(set2);
	}
}
