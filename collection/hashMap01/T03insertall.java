package collection.hashMap01;

import java.util.HashMap;

public class T03insertall {

	public static void main(String[] args) {
		HashMap mp=new HashMap();
		mp.put("K1", "V1");
		mp.put("K2", "V2");
		mp.put("K3", "V3");
		mp.put("K4", "V4");
		mp.put("K5", "V5");
		
		System.out.println("map: "+mp);
		
		HashMap mp1=new HashMap();
		mp1.put("K6", "V6");
		mp1.put("K7", "V7");
		mp1.put("K8", "V8");
		
		System.out.println("map1: "+mp1);
		mp.putAll(mp1);
		System.out.println("map: "+mp);
		
		
	}
}
