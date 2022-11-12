package application;

import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Stream<Integer> stream = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(stream.toArray()));
		
		Stream<String> stringStream = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(stringStream.toArray()));
		
		Stream<Integer> streamIterate = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(streamIterate.limit(50).toArray()));
		
		Stream<Long> Fibonacci = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1], x[0] + x[1]}).map(x -> x[0]);
		System.out.println(Arrays.toString(Fibonacci.limit(20).toArray()));
		
	}
}