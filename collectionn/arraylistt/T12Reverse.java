package collectionn.arraylistt;

import java.util.ArrayList;
import java.util.Collections;

public class T12Reverse {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(102);
		al1.add(14);
		al1.add(23);
		al1.add(56);
		System.out.println("AL: "+al1);
		
		Collections.sort(al1);
		
		System.out.println("Sorting Ascending : "+al1);
		Collections.reverse(al1);
		
		System.out.println("Reverse Sorting"+al1);
		
		
	}
}
