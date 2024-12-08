package collectionn.arraylistt;

import java.util.ArrayList;

public class practise02 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		
		System.out.println("al1 :-"+al1);
		ArrayList al2=new ArrayList(al1);
		System.out.println("al2 :"+al2);
	}
}
