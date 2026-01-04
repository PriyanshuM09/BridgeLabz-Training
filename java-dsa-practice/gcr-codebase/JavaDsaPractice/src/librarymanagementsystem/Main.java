package librarymanagementsystem;

public class Main {
    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning(new Book(101, "Java Basics", "James", "Programming", true));
        library.addAtEnd(new Book(102, "Python Guide", "Guido", "Programming", true));
        library.addAtPosition(new Book(103, "Data Structures", "Mark", "CS", false), 2);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("\nLibrary (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch Result (Author = James):");
        library.search("James");

        library.updateAvailability(103, true);
        library.removeByBookId(101);

        System.out.println("\nAfter Updates:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
