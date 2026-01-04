package studentrecordmanagement;

public class StudentLinkedList {

    private Node head;

    // Add at beginning
    public void addAtBeginning(Student student) {
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(Student student) {
        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(Student student, int position) {
        if (position == 1) {
            addAtBeginning(student);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(student);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.data.rollNo == rollNo) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Search by Roll Number
    public void search(int rollNo) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.rollNo == rollNo) {
                System.out.println("Found: " + temp.data.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade
    public void updateGrade(int rollNo, char newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.rollNo == rollNo) {
                temp.data.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all records
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(
                temp.data.rollNo + " | " +
                temp.data.name + " | " +
                temp.data.age + " | " +
                temp.data.grade
            );
            temp = temp.next;
        }
    }
}
