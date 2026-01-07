package bookbazaar;

public abstract class Book implements IDiscountable{
	  protected String title;
	    protected String author;
	    protected double price;
	    private int stock; 
	    
	    public Book(String title, String author, double price,int stock){
	    	this.title=title;
	    	this.author=author;
	    	this.price=price;
	    	this.stock=stock;
	    }
	    
	    public Book(String title, String author, double price){
	    	this(title,author,price,10);
	    }
	    
	    public int getStock(){
	    	return stock;
	    }
	    
	    public void reduceStock(int quantity){
	        if (quantity <= stock) {
	            stock -= quantity;
	        } 
	       else{
	            System.out.println("Insufficient stock for " + title);
	        }
	    }
	    
	    public double getPrice(){
	        return price;
	    }

	    public String getTitle(){
	        return title;
	    }
}
