package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.*;


public class ETC {
	public static void main(String[] args) {
		
		// Supplier 
		Supplier<String> supplier = () -> "String";
		System.out.println(supplier.get()); // String
	
	
		// Consumer
		Consumer<Integer> consumer = (num) -> System.out.println(num + 1);
		consumer.accept(1); // 2
	
	
		// Function
		Function<Integer, Integer> function = (num) -> num + 1;
		int result1 = function.apply(1);
		System.out.println(result1); // 2
	
	
		// Predicate
		Predicate<Integer> predicate = (num) -> num > 0;
		boolean result2 = predicate.test(1);
		System.out.println(result2); // true		

	}
}
