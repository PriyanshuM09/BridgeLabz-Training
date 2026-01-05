package taskscheduler;

public class Main {
    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtEnd(new Task(1, "Design Module", 1, "10-Oct"));
        scheduler.addAtEnd(new Task(2, "Code Feature", 2, "15-Oct"));
        scheduler.addAtBeginning(new Task(3, "Requirement Analysis", 1, "05-Oct"));
        scheduler.addAtPosition(new Task(4, "Testing", 3, "20-Oct"), 3);

        System.out.println("All Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nCurrent Task Cycle:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch by Priority = 1:");
        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        System.out.println("\nAfter Removing Task ID 2:");
        scheduler.displayAllTasks();
    }
}
