package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsMethodsPractice {

	public static void main(String[] args) {
		
		ArrayList<String>ff=new ArrayList<String>();
		ff.add("a");
		ff.add("b");
		ff.add("c");
		ff.add("d");
		ff.add("e");
		
		List list=ff;
		list.add(100);
		list.add(200);
		
		System.out.println(ff);
		
		Collection<String>list1=Collections.checkedCollection(ff, String.class);
		System.out.println("The checked collection type data is "+list);
	
		//System.out.println(Collections.binarySearch(ff, "d"));
		
	//	int index=Collections.binarySearch(ff, "a", Collections.reverseOrder());

	//	System.out.println("the index of a is "+index);
		System.out.println("The collectionList out put is "+Collections.checkedList(ff, String.class));
		
	}

}
