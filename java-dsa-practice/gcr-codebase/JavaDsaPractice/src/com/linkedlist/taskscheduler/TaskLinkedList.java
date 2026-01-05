package com.linkedlist.taskscheduler;

public class TaskLinkedList {
	private TaskNode head;
	private TaskNode tail;
	private TaskNode current;
	
	public void addAtBeginning(int id,String name,int priority,int date) {
		TaskNode newNode=new TaskNode(id,name,priority,date);
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
			current=head;
			
		}
		else {
			newNode.next=head;
			head=newNode;
			tail.next=head;
		}
	}
	public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            current = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

   
    public void addAtPosition(int position, int id, String name, int priority, String date) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = tail;

        do {
            if (temp.taskId == taskId) {

                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed: " + taskId);
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found");
    }

    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        System.out.println("Current Task:");
        displayTask(current);

        current = current.next;
    }

    
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;
        System.out.println("Task List:");

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
       }

    
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }


    private void displayTask(TaskNode task) {
        System.out.println("Task ID: " + task.id +  ", Name: " + task.name +  ", Priority: " + task.priority +  ", Due Date: " + task.date);
    }
}

	


