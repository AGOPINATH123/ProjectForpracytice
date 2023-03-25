package LamdaExpression;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BifunctionAndMap {
	 
	public static void main(String[] args) {
		
		Map<Integer,String>mp=new HashMap<>();
		mp.put(1, "as ");
		mp.put(2, "as ");
		mp.put(3, "as1");
		mp.put(4, "as1");
		mp.put(5, "as1");
		mp.put(6, "as2");
		mp.put(7, "as3");
		mp.put(8, "as4");
		mp.put(9, "as4");
		mp.put(10,"as5");
		mp.put(11,"as6");
		mp.put(12,"as3");
		
		
		BiFunction<Integer, String, String> f= (key , value)->
		"[key "+key+"  "+" , "+value+ "( "+Collections.frequency(mp.values(), value)+" )]";
		
		mp.forEach((k,v)->System.out.println(f.apply(k, v)));
		
		BinaryOperator<Integer> op=BinaryOperator.minBy((a,b)->(a>b)?1:((a==b)?0:-1));
		System.out.println(op.apply(12,32));
	} 
	 
	
}


