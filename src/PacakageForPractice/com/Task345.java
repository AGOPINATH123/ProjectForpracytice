package PacakageForPractice.com;

import java.util.Map;
import java.util.TreeMap;

public class Task345 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> m = new TreeMap<Integer,String>();
		
		m.put(1, "abc");
//		m.put(null, "xer");
		m.put(4, null);
		m.put(2, null);
		m.put(3, "asd");
//		m.put(null, "poi");
		for(Map.Entry e : m.entrySet()) {
		System.out.println(e.getKey() +""+ e.getValue());
		}
		
		m.remove(2);
		for(Map.Entry e : m.entrySet()) {
			System.out.println(e.getKey() +""+ e.getValue());
			}
		System.out.println( );
	}

}
