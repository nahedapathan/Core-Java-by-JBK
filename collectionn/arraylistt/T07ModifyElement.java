package collectionn.arraylistt;

import java.util.ArrayList;

public class T07ModifyElement {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(105);
		al1.add(105);
		System.out.println("AL: "+al1);
		
		al1.set(2, 103);
		System.out.println("AL: "+al1);
		
	}
}
