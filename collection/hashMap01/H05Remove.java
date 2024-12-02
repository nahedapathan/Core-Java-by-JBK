package collection.hashMap01;

import java.util.HashMap;

public class H05Remove {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"Java");
		hm.put(2, "Python");
		hm.put(3, "JS");
		System.out.println("map: "+hm);
		
		hm.remove(2);
		System.out.println("map: "+hm);
	}
}
