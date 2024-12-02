package collection.LinkedHashMap01;

import java.util.LinkedHashMap;

public class H02Insert {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
		
		//Using put
		hm.put("Two", 2);
		hm.put("Four",4);
		System.out.println("Linkedhash1: "+hm);
		
		//using putifabsent
		hm.putIfAbsent("Six", 6);
		System.out.println("LinkedhashMap1: "+hm);
		
		//Creating LinkedHashMap
		LinkedHashMap<String,Integer> number=new LinkedHashMap<>();
		number.put("One", 1);
		
		//using putall
		number.putAll(hm);
		System.out.println("Map: "+number);
		
		
	}
}
