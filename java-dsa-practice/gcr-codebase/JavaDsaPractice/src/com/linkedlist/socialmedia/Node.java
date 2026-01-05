package com.linkedlist.socialmedia;

public class Node {
	int id;
	String name;
	int age;
	FriendNode friendHead;
	Node next;
	
	Node(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		this.friendHead=null;
		this.next=null;
	}

}
