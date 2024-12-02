package collection.treemap01;

import java.util.TreeMap;

public class T02Student {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put(new Student("Vivek",89), "V-1");
		map.put(new Student("Amit",123), "V-2");
		map.put(new Student("Rahul",93), "V-3");
		
		System.out.println(map);
	}
}
