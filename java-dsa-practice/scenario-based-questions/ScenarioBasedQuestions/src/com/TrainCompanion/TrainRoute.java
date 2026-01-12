package com.TrainCompanion;

public class TrainRoute {
public Compartment head;
public Compartment tail;

public void addCompartment(String name) {
	Compartment newCompartment=new Compartment(name);
	
	if(head == null) {
		head=tail=newCompartment;
	}
	else {
		tail.next=newCompartment;
		newCompartment.previous=tail;
		tail=newCompartment;
	}
	System.out.println(name + " compartment added.");
}

public void removeCompartment(String name) {
	Compartment current= head;
	while(current !=null) {
		if(current.name.equals(name)) {
			if(current==head) {
				head=current.next;
			}
			if(current==tail) {
				tail=current.previous;
			}
			if(current.previous !=null) {
				current.previous.next=current.next;
			}
			if(current.next!=null) {
				current.next.previous=current.previous;
			}
			 System.out.println(name + " compartment removed.");
             return;
		}current=current.next;
	}
	  System.out.println(name + " not found.");
}
// Traverse backward
        public void moveBackward() {

        Compartment current = tail;

    System.out.println("\nMoving Backward:");
    while (current != null) {
        System.out.println(current.name);
        current = current.previous;
    }
}

     public void moveForward() {
	Compartment current = head;
	while(current!=null) {
		System.out.println(current.name);
		current=current.next;
	}
    }
     
     public void showNearby(String name) {
         Compartment current = head;
         while (current != null) {
      if (current.name.equals(name)) {
       System.out.println("\nCurrent: " + current.name);

     if (current.previous != null)
      System.out.println("Previous: " + current.previous.name);

    if (current.next != null)
      System.out.println("Next: " + current.next.name);
      return;
             }
             current = current.next;
         }
         System.out.println(name + " not found.");
     }
}
