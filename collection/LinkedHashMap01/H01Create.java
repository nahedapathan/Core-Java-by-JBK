package collection.LinkedHashMap01;

import java.util.LinkedHashMap;

public class H01Create {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> evennumber=new LinkedHashMap<>();
		evennumber.put("Two", 2);
		evennumber.put("Four", 4);
		System.out.println("LinkedHashMap: "+evennumber);
		
		LinkedHashMap<String,Integer> number=new LinkedHashMap<>(evennumber);
		number.put("Three", 3);
		System.out.println("LinkedHashMap2: "+number);
		
	}
}
