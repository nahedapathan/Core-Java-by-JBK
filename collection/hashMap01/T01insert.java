package collection.hashMap01;

import java.util.HashMap;

public class T01insert {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put((byte)101, (byte)201);
		map.put((short)202, (short)202);
		map.put((int)303, (int)303);
		map.put((long)404, (long)404);
		map.put(12.34f, 67.89f);
		map.put(34.56, -6789.90);
		map.put(true, false);
		map.put("key", "value");
		map.put(null, null);
		System.out.println("mp: "+map);
	}
}
