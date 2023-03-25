package LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumarr {
	static void Add(List<Integer>list) {
		int result=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result);
	}
	
	

	public static void main(String[] args) {
		List <Integer>li=new ArrayList<>();
		li.add(200);
		li.add(2100);
		li.add(120);
		li.add(124);
		li.add(1254);
		li.add(145);
		
		Consumer<List<Integer>>con=Consumarr::Add;
		con.accept(li);

	}

}
