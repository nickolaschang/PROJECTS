package util;

import entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
	@Override
	public void accept(Product product) {
		product.setPrice(product.getPrice() * 1.1);
	}
	
	@Override
	public Consumer andThen(Consumer after) {
		return Consumer.super.andThen(after);
	}
}
