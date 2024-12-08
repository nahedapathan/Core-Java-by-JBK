package collectionn.arraylistt;

import java.util.ArrayList;

public class Test06ObjectToArray {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			al1.add(101+i);
		}
		System.out.println("al1 :"+al1);
		
		Object ar[]=al1.toArray();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
