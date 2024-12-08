package collectionn.arraylistt;

import java.util.ArrayList;

public class T09ArrayListToArray {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(102);
		al1.add(105);
		al1.add(104);
		
		System.out.println("AL: "+al1);
		
		Object arr[]=al1.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
