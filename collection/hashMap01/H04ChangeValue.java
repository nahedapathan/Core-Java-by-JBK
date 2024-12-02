package collection.hashMap01;

import java.util.HashMap;

public class H04ChangeValue {

	public static void main(String[] args) {
		HashMap<Integer,String> mp=new HashMap<>();
		mp.put(1, "Java");
		mp.put(2, "Kotlin");
		mp.put(3, "Python");
		
		System.out.println("map: "+mp);
		
		//replace
		mp.replace(2, "C++");
		System.out.println("map: "+mp);
	}
}
