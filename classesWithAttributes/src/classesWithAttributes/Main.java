package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name = "Laptop";
		product.description = "Asus Laptop";
		product.setId(1);
		product.price = 5000;
		product.stockAmount = 3;
		product.renk = "gri";
		
		
		ProductManager productManagger= new ProductManager();
		productManagger.Add(product);
		System.out.println(product.getkod());
		
	
	}

}
