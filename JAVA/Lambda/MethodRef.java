package JAVA.Lambda;

import java.util.function.*;

public class MethodRef {
	public static void main(String[] args) {
		
		// Consumer
		Consumer<Integer> consumer = System.out::println;
		consumer.accept(1); // 2
	
	
		// Function
		Function<Double, Double> function = Math::sqrt;
		System.out.println(function.apply(25.0)); // 2
	
	}
}
