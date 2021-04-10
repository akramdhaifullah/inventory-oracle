package inventoryProject;

public class Product {
	
	//Instance field declarations
	private String item;
	private long price;
	private int qty;
	private int noItem;
	boolean active = true;
	
	Product(){
		
	}
	
	Product(int number, String name, int qty, long price){
		
		this.noItem = number;
		this.item = name;
		this.qty = qty;
		this.price = price;
		
	}

	// getter
	public String getItem() {
		return item;
	}

	public long getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public int getNoItem() {
		return noItem;
	}

	// setter
	public void setItem(String item) {
		this.item = item;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setNoItem(int noItem) {
		this.noItem = noItem;
	}
	
	public String toString() {
		String active = this.active == true ? "Active" : "Discontinued";
		return "Item Number\t\t: "+this.noItem+"\nName\t\t\t: "+this.item+"\nQuantity in stock\t: "+this.qty+"\nPrice\t\t\t: "
				+this.price+"\nStock Value\t\t: "+itemValue()+"\nProduct status\t\t: "+active+"\n";
	}

	//getter setter boolean
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public long itemValue() {
		return this.price * this.qty;
	}
	

}