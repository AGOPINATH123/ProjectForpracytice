package CollectionsPractice;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

enum mobile {
	Apple, SAMSUNG, HTC, REDMI;

	void Apple() {
		System.out.println("hello apple");
	}
}

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(01, "null 0");
		map1.put(02, "null 1"); // null not allowed null values are allowed;
		map1.put(03, "null 2");
		map1.put(04, "null 2");
		map1.put(04, "null 3");
		map1.put(05, "null 2");
		System.out.println(map1);
		// System.out.println(Collections.checkedMap(map1,Integer.class,String.class));

		/*
		 * Map map2=map1; map2.put(10,100);
		 */

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(10, "a");
		map2.put(11, "b");
		map2.put(12, "c");
		map2.put(13, "d");
		map2.putAll(map1);
		System.out.println(map2);
		// System.out.println(Collections.checkedMap(map2,Integer.class, String.class));
		System.out.println(mobile.HTC);

	}
}
