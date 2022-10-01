package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Vade Oranı";
		// tip  değişken = yeni bir referans
		  // class değişkeni boyle oluşturulur.
		// hepsine sırayla değer atadık. 
		     //set value
		Product product1 = new Product(); 
		product1.setName("Delongi Kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeh Kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("159");
		individualCustomer.setPhone("05969362525");
		individualCustomer.setFirstName("Zeynep");
		individualCustomer.setLastName("Doğrucan");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("059633332233");
		corporateCustomer.setTextNumber("11111111");
		corporateCustomer.setCustomerNumber("5454");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
 	} 
	
}
