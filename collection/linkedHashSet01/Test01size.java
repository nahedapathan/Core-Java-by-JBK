package collection.linkedHashSet01;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test01size {

	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		System.out.println("hashset :"+hs);
		System.out.println("hashset size :"+hs.size());
		System.out.println("hs empty :"+hs.isEmpty());
		
		ArrayList al1=new ArrayList();
		al1.add(101);
		al1.add(true);
		al1.add(102);
		al1.add("Hello");
		System.out.println("al1 :"+al1);
		
		
		LinkedHashSet hs1=new LinkedHashSet(al1);
		System.out.println(hs1);
		System.out.println("HashSet size"+hs1.size());
		System.out.println("empty :"+hs1.isEmpty());
		
		
	}
}
