package moviemanagementsystem;

public class Node {
    public Movie data;
    public Node next;
    public Node prev;

    public Node(Movie data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
