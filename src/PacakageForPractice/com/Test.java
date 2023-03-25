package PacakageForPractice.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();  // creation of arraylist  
		//int newcapacity = (oldcapacity*3)/2+1
		
		l.add("abc");
		l.add("bvc");
		l.add("qwe");
		
		Iterator itr = l.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
