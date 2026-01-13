package com.ParcelTracker;

public class ParcelTracker {

    private StageNode head;

    public void addStage(String stageName) {
        StageNode newNode = new StageNode(stageName);

        if (head == null) {
            head = newNode;
            return;
        }

        StageNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stageName.equals(afterStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }


    public void trackParcel() {
        if (head == null) {
            System.out.println("No tracking data available.");
            return;
        }

        StageNode temp = head;
        System.out.print("Parcel Status: ");

        while (temp != null) {
            System.out.print(temp.stageName + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public void checkLostParcel() {
        if (head == null) {
            System.out.println("Parcel lost: No tracking information.");
        } else {
            System.out.println("Parcel is being tracked properly.");
        }
    }
}

