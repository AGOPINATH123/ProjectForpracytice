package PacakageForPractice.com;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Test123 {

	public static void main(String[] args) {
		
		Deque<String> s = new ArrayDeque<String>();
		
		s.offer("asd");
		s.offer("zxc");
		s.offer("lkj");
		s.offerFirst("qwe");
		
		System.out.println("After offerfirst");
		
		for (String st:s) {
			System.out.println(st);
		}
		
		s.pollFirst();		
		System.out.println("After pollfirst");
		
		for (String st:s) {
			System.out.println(st);
		}
	}

}
