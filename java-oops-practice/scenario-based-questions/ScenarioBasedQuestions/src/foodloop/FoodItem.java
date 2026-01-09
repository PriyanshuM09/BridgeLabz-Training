package foodloop;

public class FoodItem {
	String name;
	String category;
	double price;
	private int stock;
	public FoodItem(String name,String category,double price, int stock) {
		this.name= name;
		this.category=category;
		this.price=price;
		this.stock=stock;
	}
	
	  protected boolean isAvailable() {
	        return stock > 0;
	    }
	    protected void reduceStock() {
	        stock--;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getName() {
	        return name;
	    }
	    public double applyDiscount(double total) {
	        if (total > 500)
	            return total * 0.9;   
	        return total;
}}
