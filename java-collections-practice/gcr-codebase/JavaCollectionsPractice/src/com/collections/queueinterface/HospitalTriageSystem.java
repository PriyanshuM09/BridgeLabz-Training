package com.collections.queueinterface;
import java.util.*;
public class HospitalTriageSystem implements Comparable<HospitalTriageSystem> {
String name;
int severity;

HospitalTriageSystem(String name, int severity){
	this.name=name;
	this.severity=severity;
}
public int compareTo(HospitalTriageSystem other) {
	return other.severity-this.severity;
}
public static void main(String args[]) {
    PriorityQueue<HospitalTriageSystem> pq = new PriorityQueue<>();

    // Adding patients
    pq.add(new HospitalTriageSystem("John", 3));
    pq.add(new HospitalTriageSystem("Alice", 5));
    pq.add(new HospitalTriageSystem("Bob", 2));
    
    System.out.println("treatment Order");
    while(!pq.isEmpty()) {
    	 HospitalTriageSystem p = pq.remove();
         System.out.println(p.name);
    }
}
}
