package CollectionsPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapEX1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> mm = new HashMap<String, Integer>();

		/*
		 * for(int i=0;i<=2;i++) {
		 * System.out.println("enter key in the form of String"); String s=sc.next();
		 * System.out.println("enter value in the form of int"); int d=sc.nextInt();
		 * 
		 * 
		 * mm.put(s, d);
		 * 
		 * }
		 */

		System.out.println(mm);

		mm.put("india", 120);
		mm.put("china", 145);
		mm.put("rhom ", 111);
		mm.put("spain", 23);
		mm.put("japan", 10);

		/*
		 * for(int i=0;i<=mm.size();i++) { System.out.println( i+" "+mm);
		 * 
		 * }
		 */
		Set<String> keys = mm.keySet();

		Collection<Integer> values = mm.values();
		for (Integer integer : values) {
			System.out.println(integer + "++ " + mm.get(integer));

		}

		Set<Entry<String, Integer>> keys1 = mm.entrySet();
		/*
		 * for (Entry<String, Integer> key: value) { System.out.println(key);}
		 * 
		 * System.out.println(mm.get("india")); Collection<Integer> values =
		 * mm.values(); for (Integer value1 : values) { //foreach
		 * System.out.println(value1); }
		 */
		for (String i : keys) {
			System.out.println(mm.get(i) + ">>>>>>" + i);
		}
		
		/*
		 * for (Object key : keys1) { System.out.println(key);
		 * 
		 * } for(Map.Entry<String, Integer> valu: keys1) { System.out.println(valu);}
		 * 
		 * 
		 */
		
         for (Entry<String, Integer> entry : keys1) {
	System.out.println(entry);
	
}
	}

}
