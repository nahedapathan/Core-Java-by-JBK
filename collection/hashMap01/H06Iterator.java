package collection.hashMap01;

import java.util.HashMap;
import java.util.Map.Entry;

public class H06Iterator {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Java");
		hm.put(2, "Js");
		hm.put(3, "C++");
		
		System.out.println("Map: "+hm);
		
		//iterate through key only
		System.out.println("Keys");
		for(Integer key:hm.keySet())
		{
			System.out.println(key);
		}
		
		//Iterator values only
		System.out.println("Values");
		for(String value:hm.values())
		{
			System.out.println(value);
		}
		
		//iterate entries
		for(Entry<Integer,String> entry:hm.entrySet())
		{
			System.out.println(entry);
		}
	}
}
