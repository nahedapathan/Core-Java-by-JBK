package collectionn.arraylistt;

import java.util.ArrayList;

public class Test03AddAll {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			al1.add(101+i);
		}
		
		System.out.println("al1 :"+al1);
		ArrayList al2=new ArrayList();
		al2.add("E1");
		al2.add("E2");
		al2.add("E3");
		System.out.println("al2 :"+al2);
		al2.addAll(al1);
		
		System.out.println("al2 :"+al2);
		
		ArrayList al3=new ArrayList();
		al3.add("E4");
		al3.add("E5");
		al3.add("E5");
		al2.addAll(6, al3);
		System.out.println("al2 :"+al2);
		
		
	}
}
