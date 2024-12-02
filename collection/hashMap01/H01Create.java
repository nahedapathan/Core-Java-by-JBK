package collection.hashMap01;

import java.util.HashMap;

public class H01Create {

	public static void main(String[] args) {
		//create hashmap
		HashMap<String,Integer> hmp=new HashMap<>();
		
		//add element
		hmp.put("java", 8);
		hmp.put("JS", 1);
		hmp.put("Python", 3);
		System.out.println("map: "+hmp);
	}
}
