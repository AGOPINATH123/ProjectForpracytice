package MethodReference;

import java.time.LocalDate;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FuctionalInterfacePracticeMethods {

	public static void main(String[] args) {
		Function<String, Integer> stringToInteger = Integer::parseInt;
		Integer number = stringToInteger.apply("123");
System.out.println(number);

Consumer<String> printConsumer = System.out::println;
printConsumer.accept("Hello World!");

Supplier<String> randomString = () -> UUID.randomUUID().toString();
String randomUUID = randomString.get();
System.out.println(randomUUID);

Predicate<String> isLongerThanFive = s -> s.length() > 5;
boolean check = isLongerThanFive.test("Hello");
System.out.println(check);

UnaryOperator<String> makeUpperCase = String::toUpperCase;
String upper = makeUpperCase.apply("hello");
System.out.println(upper);

Supplier<LocalDate> currentDate = LocalDate::now;
System.out.println(currentDate.get()); // the current date

Predicate<String> isEmptyString = String::isEmpty;
System.out.println(isEmptyString.test("")); // true

System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);




	}

}
