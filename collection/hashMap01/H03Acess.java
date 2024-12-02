package collection.hashMap01;

import java.util.HashMap;

public class H03Acess {

	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<>();
		mp.put(1, "Java");
		mp.put(2, "Python");
		mp.put(3, "Js1");
		System.out.println("Map: "+mp);
		
		//get method get value
		System.out.println(mp.get(1));
		
		//keyset
		System.out.println("Keys: "+mp.keySet());
		
		//values
		System.out.println("Values: "+mp.values());
		
		//retuen key value pair
		System.out.println(mp.entrySet());
	}
}
