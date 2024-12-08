package collectionn.arraylistt;

import java.util.ArrayList;

public class Test04Remove {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			al1.add(101+i);
		}
		System.out.println("al1 :-"+al1);
		
		System.out.println(al1.remove(4)+" removed");
		System.out.println("al1 :"+al1);
		
		System.out.println(al1.remove(new Integer(103)));
		System.out.println("al1 :"+al1);
		
		System.out.println(al1.remove("JTC"));
		System.out.println("al1 :"+al1);
	}
}
