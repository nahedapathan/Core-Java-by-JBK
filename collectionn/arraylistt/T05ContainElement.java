package collectionn.arraylistt;

import java.util.ArrayList;

public class T05ContainElement {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(103);
		al1.add(105);
		
		System.out.println("AL: "+al1);
		
		System.out.println(al1.contains(103));
	}
}
