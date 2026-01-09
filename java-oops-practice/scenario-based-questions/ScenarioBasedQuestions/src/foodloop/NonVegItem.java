package foodloop;

public class NonVegItem extends FoodItem{
	
public  NonVegItem(String name,double price,int stock) {
	super(name,"NonVeg",price,stock);
}
public double applyDiscount(double total) {
    return total * 0.92;  
}
}
