package librarymanagementsystem;

public class Node {
    public Book data;
    public Node next;
    public Node prev;

    public Node(Book data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

