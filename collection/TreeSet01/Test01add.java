package collection.TreeSet01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Test01add {

	public static void main(String[] args) {
		
		//Creating empty treeset using default constructor
		TreeSet t1=new TreeSet();
		t1.add(new Integer(2));
		t1.add(new Integer(1));
		t1.add(new Integer(4));
		System.out.println("t1 :"+t1);
		
		//Natural sorting with array and array sort
		Integer ar1[]= {10,2,5,8,12};
		Arrays.sort(ar1);
		for(Integer i:ar1)
		{
			System.out.println(i);
		}
		
		
		//Natural sorting with arrayList using collection
		ArrayList al=new ArrayList();
		al.add(101);
		al.add(23);
		al.add(-90);
		al.add(678);
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		
		
		
		
		
	}
}
