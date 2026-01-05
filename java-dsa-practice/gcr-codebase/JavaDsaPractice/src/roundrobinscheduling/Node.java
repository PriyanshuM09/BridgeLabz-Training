package roundrobinscheduling;

public class Node {
    public Process data;
    public Node next;

    public Node(Process data) {
        this.data = data;
        this.next = null;
    }
}

