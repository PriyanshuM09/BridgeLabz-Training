package taskscheduler;

public class TaskCircularLinkedList {

    public Node head;
    private Node current;   

    public void addAtBeginning(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    public void addAtEnd(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void addAtPosition(Task task, int position) {
        if (position == 1) {
            addAtBeginning(task);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(task);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    
    public void removeByTaskId(int taskId) {
        if (head == null) return;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.data.taskId == taskId) {

                if (curr == head) {
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }


    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current.data);
        current = current.next;
    }

    
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        Node temp = head;
        do {
            displayTask(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;

        Node temp = head;
        do {
            if (temp.data.priority == priority) {
                displayTask(temp.data);
            }
            temp = temp.next;
        } while (temp != head);
    }

    private void displayTask(Task t) {
        System.out.println(
            t.taskId + " | " + t.taskName + " | " +
            t.priority + " | " + t.dueDate
        );
    }
}

