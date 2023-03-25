package CollectionsPractice;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
public static void main(String[] args) {
	
	Queue gg=new PriorityQueue();
	/*gg.add("hello ");
	gg.add("hi ");
	gg.add("say ");
	gg.add("bye ");
	gg.add("to ");	  //Duplicated are allowed
	gg.add("everyone ");
	gg.add("hello ");	
	gg.add("hello ");

	gg.add("hello ");
/*	gg.add(null);   //nulls are not allowed,
	gg.add(null);*/
	//gg.offer(200);*/

	
	Queue fg=gg;  //cannot add one type variables to other type like string to integer;
	 	fg.add(200);
	fg.add(101);
	fg.add(1012);
	fg.add(203);
	fg.add(21);
	fg.add(356);
	fg.offer(566);


	System.out.println(gg);
	List<String >ref=Arrays.asList("hello","hi","may be","stay");
	System.out.println(ref);

	
	
	
	
}
}
