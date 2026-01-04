package moviemanagementsystem;

public class MovieDoublyLinkedList {

    public Node head;
    public Node tail;

    // Add at beginning
    public void addAtBeginning(Movie movie) {
        Node newNode = new Node(movie);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(Movie movie) {
        Node newNode = new Node(movie);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at specific position (1-based)
    public void addAtPosition(Movie movie, int position) {
        if (position == 1) {
            addAtBeginning(movie);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(movie);
            return;
        }

        Node newNode = new Node(movie);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Remove by Movie Title
    public void removeByTitle(String title) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.title.equalsIgnoreCase(title)) {

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

    // Search by Director or Rating
    public void search(String director, double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.director.equalsIgnoreCase(director) ||
                temp.data.rating == rating) {
                displayMovie(temp.data);
            }
            temp = temp.next;
        }
    }

    // Update Rating by Title
    public void updateRating(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.title.equalsIgnoreCase(title)) {
                temp.data.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            displayMovie(temp.data);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            displayMovie(temp.data);
            temp = temp.prev;
        }
    }

    private void displayMovie(Movie m) {
        System.out.println(
            m.title + " | " + m.director + " | " + m.year + " | " + m.rating
        );
    }
}
