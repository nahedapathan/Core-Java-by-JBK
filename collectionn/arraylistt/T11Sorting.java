package collectionn.arraylistt;

import java.util.ArrayList;
import java.util.Collections;

public class T11Sorting {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(23);
		al1.add(1089);
		al1.add(69);
		System.out.println("AL: "+al1);
		
		Collections.sort(al1);
		System.out.println("AL: "+al1);
	}
}
