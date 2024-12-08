
package collectionn.arraylistt;

import java.util.ArrayList;

public class Test05RemoveAll {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			al1.add(101+i);
		}
		System.out.println("al1 :"+al1);
		ArrayList al2=new ArrayList();
		al2.add(101);
		al2.add(118);
		al2.add(109);
		
		System.out.println(al1.removeAll(al2));
		System.out.println("al1 :"+al1);
	}
}
