package com.TrainCompanion;

public class Compartment {
public String name;
public Compartment next;
public Compartment previous;

public Compartment(String name) {
	this.name= name;
	this.next=null;
	this.previous=null;
}

}
