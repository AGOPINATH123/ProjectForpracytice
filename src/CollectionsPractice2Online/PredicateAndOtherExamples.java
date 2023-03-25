package CollectionsPractice2Online;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

	    public class PredicateAndOtherExamples {
 	    public static void main(String[] args) {
		Predicate<Integer> pr = a -> (a > 15);
		System.out.println(pr.test(230));
		System.out.println(pr.test(12));
		BiPredicate<Integer, String> pr1 = (x, y) -> {
			return y.length() == x;
		};
		boolean result = pr1.test(4, "gopi");
		System.out.println(result);
		List<Integer> li = Arrays.asList(1, 2, 3, 5, 4, 8, 6, 56, 5, 55, 663, 55, 68, 66, 9, 8);
		List<Integer> kl = li.stream().filter(x -> x > 5 &&  x<70).collect(Collectors.toList());
		kl.forEach(h->System.out.println(h));		
		BinaryOperator<Integer>hg2=BinaryOperator.maxBy((a,b)->(a>b)?1:((a==b)?0:-1));
		;
		System.out.println(hg2.apply(22, 89));
	
		
		
	}

}
