package com.linkedlist.taskscheduler;

public class TaskMain {
	    public static void main(String[] args) {

	        TaskLinkedList scheduler = new TaskLinkedList();

	        scheduler.addAtEnd(1, "Design Module", 1, "10-01-2026");
	        scheduler.addAtEnd(2, "Code Review", 2, "12-01-2026");
	        scheduler.addAtBeginning(3, "Testing", 1, "08-01-2026");

	        scheduler.displayAllTasks();

	        scheduler.viewCurrentTask();
	        scheduler.viewCurrentTask();

	        scheduler.searchByPriority(1);

	        scheduler.removeByTaskId(2);

	        scheduler.displayAllTasks();
	    }
	}


