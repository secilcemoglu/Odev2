package classesWithAttributes;

public class Product {
	
	//constructor//
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");
	}
	public Product() {
		
	}
	
	//attribute ; feald --> ürün özellikleri
	// getter ve setter oluşt. için sağ tık Refactor-->Encapsulate field
	private int id;
	 String name;
	 String description;
	 double price;
	 int stockAmount;
	 String kod;
	 String renk;
	
	// getter //
	public int getId() {
		// id duzenlenemez sadece okunabilir //
		return id;
	}
	// setter //
	public void setId(int id) {
		this.id=id;
	}
	
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	
	
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	
	
	public int getstockAmount() {
		return stockAmount;
	}
	public void settockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	
	
	public String getkod() {
		return this.name.substring(0,1) + id;
	}
}
