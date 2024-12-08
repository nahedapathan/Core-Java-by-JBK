package collectionn.arraylistt;

import java.util.ArrayList;

public class Test01Size {

	public static void main(String[] args) {
		ArrayList al1= new ArrayList();
		System.out.println("al1 :"+al1);
	    System.out.println("size :"+al1.size());
	    al1.add(101);
	    al1.add("Hello");
	    al1.add(true);
	    System.out.println("al1 :"+al1);
	    System.out.println("size :"+al1.size());
	}
}
