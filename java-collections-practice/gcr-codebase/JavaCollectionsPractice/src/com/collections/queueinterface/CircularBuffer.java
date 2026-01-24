package com.collections.queueinterface;

public class CircularBuffer {
    int[] buffer;
    int size;
    int front = 0;
    int rear = 0;
    int count = 0;

    // Constructor
    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    // Insert element
    public void insert(int value) {

  if(count==size){
            front =(front + 1)%size;
      count--;
        }

    buffer[rear] = value;
    rear=(rear + 1)%size;
        count++;
    }
    public void display(){
        int i = front;
        int elements = count;

        while(elements>0){
          System.out.print(buffer[i]+ " ");
            i=(i+1)%size;
          elements--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
   CircularBuffer cb = new CircularBuffer(3);
      cb.insert(1);
     cb.insert(2);
     cb.insert(3);
      cb.display();   
        cb.insert(4);
        cb.display();   
    }
}
