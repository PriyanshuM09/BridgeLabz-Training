package com.CallCenter;

import java.util.*;

public class CallCenterService {

    public Queue<Customer> normalQueue = new LinkedList<>();
    public PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> a.name.compareTo(b.name));
    public HashMap<String, Integer> callRecord = new HashMap<>();
    public void addCall(String customerName, boolean isVip) {

        Customer customer = new Customer(customerName, isVip);

      if(isVip){
            vipQueue.add(customer);
            System.out.println("VIP Call from: " + customerName);
        } 
        else {
            normalQueue.add(customer);
            System.out.println("Normal Call from: " + customerName);
        }

        callRecord.put(customerName, callRecord.getOrDefault(customerName, 0) + 1);
    }

    public void serveCall() {
        if (!vipQueue.isEmpty()) {
            Customer vipCustomer = vipQueue.poll();
            System.out.println("Serving VIP: " + vipCustomer.name);
        } else if (!normalQueue.isEmpty()) {
            Customer normalCustomer = normalQueue.poll();
            System.out.println("Serving Normal: " + normalCustomer.name);
        } else {
            System.out.println("No calls waiting.");
        }
    }
    public void showCallHistory() {
        System.out.println("\nMonthly Call Count:");
        for (String name : callRecord.keySet()) {
            System.out.println(name + " -> " + callRecord.get(name) + " calls");
        }
    }
}
