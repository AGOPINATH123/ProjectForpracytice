package CollectionsPractice2Online;

import java.util.function.BiFunction;
public class BiFunction12 {
	
	 
	public static void main(String[] args) {
		BiFunction<String,String,String> tt=(a,b)->{
			System.out.println("the name of a is "+a+" and the ane of b is "+b);
			return a;
		};
		tt.apply("gopi", "padma");
		
		BiFunction<Integer,Integer,String> hj=(a,b)->{
			System.out.println(Math.addExact(a, b));
 
			return "hello "+a+" hello "+b;
		};
		String re=String.valueOf(Math.addExact(12, 32));
		System.out.println(hj.apply(12, 32));
		System.out.println("result String "+re);
		

	}

}
