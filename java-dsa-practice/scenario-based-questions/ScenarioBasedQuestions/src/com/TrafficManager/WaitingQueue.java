package com.TrafficManager;

public class WaitingQueue{
    int front = -1, rear = -1;
    String[] queue = new String[5];

    public boolean isFull(){
        return rear == queue.length - 1;
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public void addCar(String car){
        if (isFull()) {
            System.out.println("Queue Overflow! No space for " + car);
            return;
        }
        if (front == -1) front = 0;
        queue[++rear] = car;
        System.out.println(car + " is waiting.");
    }
    public String removeCar(){
        if (isEmpty()) {
            System.out.println("Queue Underflow! No cars waiting.");
            return null;
        }

        String car = queue[front++];

        if (front > rear) {
            front = rear = -1;
        }

        return car;
    }
}

