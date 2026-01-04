package studentrecordmanagement;

public class Main {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(new Student(1, "Aman", 20, 'A'));
        list.addAtEnd(new Student(2, "Riya", 21, 'B'));
        list.addAtPosition(new Student(3, "Karan", 22, 'C'), 2);

        list.display();

        list.search(2);
        list.updateGrade(3, 'A');
        list.deleteByRollNo(1);

        System.out.println("After Updates:");
        list.display();
    }
}

