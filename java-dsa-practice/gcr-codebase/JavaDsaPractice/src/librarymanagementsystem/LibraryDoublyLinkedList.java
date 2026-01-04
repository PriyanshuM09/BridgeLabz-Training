package librarymanagementsystem;

public class LibraryDoublyLinkedList {

    public Node head;
    public Node tail;

    // Add at beginning
    public void addAtBeginning(Book book) {
        Node newNode = new Node(book);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(Book book) {
        Node newNode = new Node(book);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtPosition(Book book, int position) {
        if (position == 1) {
            addAtBeginning(book);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(book);
            return;
        }

        Node newNode = new Node(book);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    public void removeByBookId(int bookId) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.bookId == bookId) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void search(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.title.equalsIgnoreCase(key) ||
                temp.data.author.equalsIgnoreCase(key)) {
                displayBook(temp.data);
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(int bookId, boolean status) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.bookId == bookId) {
                temp.data.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            displayBook(temp.data);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            displayBook(temp.data);
            temp = temp.prev;
        }
    }
    public int countBooks() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void displayBook(Book b) {
        System.out.println(
            b.bookId + " | " + b.title + " | " + b.author + " | " +
            b.genre + " | " + (b.isAvailable ? "Available" : "Issued")
        );
    }
}
