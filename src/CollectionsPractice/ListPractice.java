package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListPractice {
public static void main(String[] args) {
	
	ArrayList<Integer>gg=new ArrayList<Integer>();
	List<Integer>g1=new ArrayList<Integer>();

	
	//al.add("jgs");

	//ArrayList gg=al;
	gg.add(100);
	gg.add(125);
	gg.add(354);
	gg.add(256);
	gg.add(100);
	gg.add(458);
	gg.add(577);
	gg.add(589);
	gg.add(563);
	
	
g1= gg.stream().filter(p->p%2==0).collect(Collectors.toList());
System.out.println(g1);


	/*for(Object s:gg) {
		System.out.println(s);
	}*/
	
}
}
