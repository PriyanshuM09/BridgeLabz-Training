package com.linkedlist.taskscheduler;

public class TaskNode {

int id;
String name;
int priority;
int date;

TaskNode next;
TaskNode(int id,String name,int priority,int date){
	this.id=id;
	this.name=name;
	this.priority=priority;
	this.date=date;
	this.next=null;
}

}
