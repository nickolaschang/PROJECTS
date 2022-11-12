package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product product) {
		return product.getPrice() >= 100;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100;
	}
	
	public static void staticUpdate(Product product) {
		product.setPrice(product.getPrice() * 1.1);
	}
	public void nonStaticUpdate(Product product){
		price = price * 1.1;
	}
	
	@Override
	public String toString() {
		return "Product: " + name + "Price: $" + String.format("%.2f", price);
	}
	
}