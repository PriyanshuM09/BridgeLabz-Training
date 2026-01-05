package com.linkedlist.studentrecordmanagement;

public class StudentLinkedList {
	private StudentNode head;
public void add(int rollNo,String name,int age,char grade) {
	StudentNode newNode=new StudentNode(rollNo,name,age,grade);
	newNode.next=head;
	head=newNode;
}
public void end(int rollNo,String name,int age,char grade) {
	StudentNode newNode=new StudentNode(rollNo,name,age,grade);
	if(head==null) {
		head=newNode;
		return;
	}
	StudentNode temp=head;
	while(temp.next!=null) {
		temp=temp.next;
		
	}
	temp.next=newNode;
	
	
}

public void addAtPosition(int position, int rollNo, String name, int age, char grade) {
    if (position == 1) {
        add(rollNo, name, age, grade);
        return;
    }

    StudentNode newNode = new StudentNode(rollNo, name, age, grade);
    StudentNode temp = head;

    for (int i = 1; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Invalid position!");
        return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
}


public void deleteByRollNo(int rollNo) {
    if (head == null) {
        System.out.println("List is empty!");
        return;
    }

    if (head.rollNo == rollNo) {
        head = head.next;
        System.out.println("Student deleted successfully.");
        return;
    }

    StudentNode temp = head;
    while (temp.next != null && temp.next.rollNo != rollNo) {
        temp = temp.next;
    }

    if (temp.next == null) {
        System.out.println("Student not found!");
    } else {
        temp.next = temp.next.next;
        System.out.println("Student deleted successfully.");
    }
}


public void searchByRollNo(int rollNo) {
    StudentNode temp = head;
    while (temp != null) {
        if (temp.rollNo == rollNo) {
            System.out.println("Student Found:");
            displayStudent(temp);
            return;
        }
        temp = temp.next;
    }
    System.out.println("Student not found!");
}

public void updateGrade(int rollNo, char newGrade) {
    StudentNode temp = head;
    while (temp != null) {
        if (temp.rollNo == rollNo) {
            temp.grade = newGrade;
            System.out.println("Grade updated successfully.");
            return;
        }
        temp = temp.next;
    }
    System.out.println("Student not found!");
}


public void displayAll() {
    if (head == null) {
        System.out.println("No student records available.");
        return;
    }

    StudentNode temp = head;
    while (temp != null) {
        displayStudent(temp);
        temp = temp.next;
    }
}

private void displayStudent(StudentNode student) {
    System.out.println(
        "Roll No: " + student.rollNo +
        ", Name: " + student.name +
        ", Age: " + student.age +
        ", Grade: " + student.grade
    );
}
}


