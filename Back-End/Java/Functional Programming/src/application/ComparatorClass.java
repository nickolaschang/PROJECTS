package application;

import entities.Product;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorClass implements Comparator<Product> {
	
	@Override
	public int compare(Product product1, Product product2) {
		return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
	}
	
	@Override
	public Comparator<Product> reversed() {
		return Comparator.super.reversed();
	}
	
	@Override
	public Comparator<Product> thenComparing(Comparator<? super Product> other) {
		return Comparator.super.thenComparing(other);
	}
	
	@Override
	public <U> Comparator<Product> thenComparing(Function<? super Product, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
		return Comparator.super.thenComparing(keyExtractor, keyComparator);
	}
	
	@Override
	public <U extends Comparable<? super U>> Comparator<Product> thenComparing(Function<? super Product, ? extends U> keyExtractor) {
		return Comparator.super.thenComparing(keyExtractor);
	}
	
	@Override
	public Comparator<Product> thenComparingInt(ToIntFunction<? super Product> keyExtractor) {
		return Comparator.super.thenComparingInt(keyExtractor);
	}
	
	@Override
	public Comparator<Product> thenComparingLong(ToLongFunction<? super Product> keyExtractor) {
		return Comparator.super.thenComparingLong(keyExtractor);
	}
	
	@Override
	public Comparator<Product> thenComparingDouble(ToDoubleFunction<? super Product> keyExtractor) {
		return Comparator.super.thenComparingDouble(keyExtractor);
	}
}
