package collectionn.arraylistt;

import java.util.ArrayList;
import java.util.Comparator;

public class Test07Comparator {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(104);
		al1.add(103);
		al1.sort(Comparator.naturalOrder());
		System.out.println(al1);
		
		al1.sort(Comparator.reverseOrder());
		System.out.println(al1);
		
	}
}
