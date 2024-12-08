package collectionn.arraylistt;

import java.util.ArrayList;

public class T10SubListMethod {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(23);
		al1.add(79);
		System.out.println("AL: "+al1);
		
		System.out.println("SubList: "+al1.subList(1, 3));
	}
}
