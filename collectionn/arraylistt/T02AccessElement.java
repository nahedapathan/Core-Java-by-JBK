package collectionn.arraylistt;

import java.util.ArrayList;

public class T02AccessElement {
	
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(56);
		al1.add(22);
		al1.add(63);
		System.out.println("AL: "+al1);
		System.out.println(al1.get(3));
	}

}
