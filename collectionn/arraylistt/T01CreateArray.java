package collectionn.arraylistt;

import java.util.ArrayList;

public class T01CreateArray {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add("Naheda");
		al1.add(36.66);
		al1.add('A');
		System.out.println("AL: "+al1);
		al1.add(null);
		
		System.out.println("AL: "+al1);
	}
}
