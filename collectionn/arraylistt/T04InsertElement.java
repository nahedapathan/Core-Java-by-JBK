package collectionn.arraylistt;

import java.util.ArrayList;

public class T04InsertElement {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(104);
		al1.add(109);
		System.out.println("AL: "+al1);
		
		al1.add(2, 103);
		al1.add(4,105);
		System.out.println("AL: "+al1);
	}
}
