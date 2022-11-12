package util;

import entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
	@Override
	public boolean test(Product product) {
		return product.getPrice() >= 100;
		
	}
	@Override
	public Predicate and(Predicate other) {
		return Predicate.super.and(other);
	}
	
	@Override
	public Predicate negate() {
		return Predicate.super.negate();
	}
	
	@Override
	public Predicate or(Predicate other) {
		return Predicate.super.or(other);
	}
}
