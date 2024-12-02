package collection.hashMap01;

import java.util.HashMap;

public class T02Modify {

	public static void main(String[] args) {
		HashMap mp=new HashMap();
		System.out.println(mp.put("K1", "V1"));
		
		System.out.println("mp: "+mp);
		
		System.out.println(mp.put("K1", "V2"));
		System.out.println("mp: "+mp);
	}
}
