package moviemanagementsystem;

public class MovieManagementMain {
	public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning(new Movie("Inception", "Nolan", 2010, 8.8));
        list.addAtEnd(new Movie("Interstellar", "Nolan", 2014, 8.6));
        list.addAtPosition(new Movie("Avatar", "Cameron", 2009, 7.8), 2);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("\nReverse Display:");
        list.displayReverse();

        System.out.println("\nSearch Result:");
        list.search("Nolan", 0);

        list.updateRating("Avatar", 8.0);
        list.removeByTitle("Inception");

        System.out.println("\nAfter Updates:");
        list.displayForward();
	}
}
