package util;

import entities.Product;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;

public class UpperCaseName implements Function<Product, String> {
	
	
	@Override
	public String apply(Product product) {
		return product.getName().toUpperCase();
	}
	
	@Override
	public <V> Function<V, String> compose(Function<? super V, ? extends Product> before) {
		return Function.super.compose(before);
	}
	
	@Override
	public <V> Function<Product, V> andThen(Function<? super String, ? extends V> after) {
		return Function.super.andThen(after);
	}
	
	
}
