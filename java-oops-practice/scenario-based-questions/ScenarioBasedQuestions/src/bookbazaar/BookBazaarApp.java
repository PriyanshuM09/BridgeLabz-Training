package bookbazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        Book ebook = new EBook(
                "Java Mastery",
                "James Gosling",
                500
        );

        Book printedBook = new PrintedBook(
                "Clean Code",
                "Robert Martin",
                800,
                5
        );

        Order order = new Order("Priyanshu");

        double amount1 = order.placeOrder(ebook, 2);
        System.out.println("EBook Order Amount: " + amount1);

        double amount2 = order.placeOrder(printedBook, 1);
        System.out.println("Printed Book Order Amount: " + amount2);

        System.out.println("Order Status: " + order.getOrderStatus());
    }
}

