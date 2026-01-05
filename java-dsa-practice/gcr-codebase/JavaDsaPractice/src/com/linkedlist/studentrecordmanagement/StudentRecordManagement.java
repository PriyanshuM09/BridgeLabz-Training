package com.linkedlist.studentrecordmanagement;
import java.util.*;
public class StudentRecordManagement {
public static void main(String[]args) {
	StudentLinkedList list=new StudentLinkedList();
	Scanner sc=new Scanner(System.in);
	list.add(101,"suyash",20 ,'A');
	list.end(102, "neha",21 , 'B');
	list.addAtPosition(2, 103, "rahul", 19, 'A');
		list.displayAll();
		list.searchByRollNo(103);
		list.updateGrade(102,'A');
		list.deleteByRollNo(101);
		list.displayAll();
}
}
