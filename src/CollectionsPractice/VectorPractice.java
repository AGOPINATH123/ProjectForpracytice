package CollectionsPractice;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(100);
		v.add("gopi");
		v.add(true);
		System.out.println(v);
		Collections.rotate(v, 1);
		System.out.println(v);
		
		Enumeration  eb=v.elements();
		while(eb.hasMoreElements()) {
			System.out.println(eb.nextElement());
		}
		System.out.println(Collections.emptyIterator());
		
		
		
		
		
	}}
