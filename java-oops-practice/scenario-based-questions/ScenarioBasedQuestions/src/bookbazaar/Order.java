package bookbazaar;

public class Order {

    private String userName;
    private String orderStatus; 

    public Order(String userName) {
        this.userName = userName;
        this.orderStatus = "CREATED";
    }

    public double placeOrder(Book book, int quantity) {

        double finalAmount = book.applyDiscount(book.getPrice(), quantity);

        book.reduceStock(quantity);
        updateStatus("CONFIRMED");

        return finalAmount;
    }

    private void updateStatus(String status) { 
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
