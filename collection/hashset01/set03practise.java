package collection.hashset01;

import java.util.HashSet;

public class set03practise {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println("Added : "+hs.add(101));
		System.out.println("Added : "+hs.add("Hello"));
		System.out.println("Added : "+hs.add(12.34));
		System.out.println("Added  : "+hs.add(null));
		System.out.println("Added : "+hs.add(102));
		
		//size
		System.out.println("Number of Element : "+hs.size());
		
		//empty
		System.out.println("Empty status : "+hs.isEmpty());
		
		//contain
		System.out.println("Element availability :"+hs.contains("Hello"));
		System.out.println("Element Availability : "+hs.contains("Jtc"));
		
		System.out.println(hs);
		
		//Remove 
		System.out.println("Remove Element :"+hs.remove(102));
		System.out.println(hs);
	}
}
