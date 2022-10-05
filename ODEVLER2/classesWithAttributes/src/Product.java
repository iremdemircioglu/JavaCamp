public class Product {
	
	
	//OVERLOADING
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
	}
	
	public Product() {
		
	}
	
	
	//attribute or field
	private int id;
	private String name;
	private String description;
	private int stockAmount;
	private double price;
	private String renk;
	private String kod;

	
	//GET --> READ ONLY
	//SET --> CAN CHANGE THE VALUE
	//THIS --> BELONG THE CLASS WHICH WE ARE IN
	
	//getter
	public int getId() {
		return id;
	}
    //setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + this.id;
	}

	
	
	
	
	

}
