package foodloop;

public class Main {
	
	    public static void main(String[] args) {

	        FoodItem pizza = new VegItem("Cheese Pizza", 250, 5);
	        FoodItem burger = new NonVegItem("Chicken Burger", 180, 3);
	        FoodItem pasta = new VegItem("White Sauce Pasta", 220, 4);

	        Order order = new Order();

	        order.addItem(pizza);
	        order.addItem(burger);
	        order.addItem(pasta);

	        order.placeOrder();
	    }
	}


