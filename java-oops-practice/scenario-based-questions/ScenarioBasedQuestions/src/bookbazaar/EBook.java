package bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE); 
    }

    @Override
    public double applyDiscount(double price, int quantity) {
        double total = price * quantity;
        return total - (total * 0.20); 
    }
}

