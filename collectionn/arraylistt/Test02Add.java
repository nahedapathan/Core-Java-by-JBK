package collectionn.arraylistt;

import java.util.ArrayList;

public class Test02Add {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		for(int i=1;i<=10;i++)
		{
			al1.add(101+i);
		}
		System.out.println("al1 :"+al1);
		al1.add(5,"Hello");
		System.out.println("al1 :"+al1);
	}
}
