package collectionn.arraylistt;

import java.util.ArrayList;

public class T08ClearElement {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(103);
		System.out.println("AL: "+al1);
		al1.clear();
		System.out.println("AL: "+al1);
	}
}
