package LamdaExpression;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Bifuctionmmm {

	public static void main(String[] args) {
          BiFunction<Integer,Integer,Integer>bg=(a,b)->a+b;
          System.out.println(bg.apply(20, 12)); //32
		
          Function<Integer,Integer>hg=(a)->(a*a);
          
          System.out.println(bg.andThen(hg).apply(12, 23));
	}

}


