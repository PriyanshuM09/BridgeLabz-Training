package com.linkedlist.inventorymanagementsystem;
public class ItemLinkedList {
    private ItemNode head;

    // Add at start
    public void addAtStart(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void addAtPos(int pos, int itemId, String itemName, int quantity, double price) {
        if (pos == 1) {
            addAtStart(itemId, itemName, quantity, price);
            return;
        }

        ItemNode newNode = new ItemNode(itemName, itemId, quantity, price);
        ItemNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void displayInventory() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.itemId + ", Name: " + temp.itemName + 
                               ", Qty: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
    }
    }

    public void searchByItemId(int id){
        ItemNode temp=head;
        while (temp!=null) {
            if (temp.itemId==id) {
                System.out.println("Found: ID: " + temp.itemId + ", Name: " + temp.itemName + 
                         ", Qty: " + temp.quantity + ", Price: " + temp.price);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found");
    }


    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId==id) {
                temp.quantity=newQty;
                System.out.println("Quantity updated for ID: " + id);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found");
    }


    public void calculateTotalValue(){
        double total=0;
        ItemNode temp=head;
        while (temp!=null) {
            total+=temp.quantity * temp.price;
            temp=temp.next;
        }
        System.out.println("Total Inventory Value = " + total);
    }

    public void sortByName(boolean ascending) {
        head=mergeSort(head, ascending, true);
    }

    public void sortByPrice(boolean ascending) {
        head=mergeSort(head, ascending, false);
    }

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean sortByName){
        if (node==null|| node.next == null) return node;

        ItemNode middle = getMiddle(node);
        ItemNode nextOfMiddle = middle.next;
        middle.next = null;

        ItemNode left=mergeSort(node, asc, sortByName);
        ItemNode right=mergeSort(nextOfMiddle, asc, sortByName);

        return sortedMerge(left, right, asc, sortByName);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean sortByName) {
        if (a == null)return b;
        if (b == null)return a;

        boolean condition;
        if(sortByName){
            condition=asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                            : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } 
        else {
            condition=asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, asc, sortByName);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, asc, sortByName);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {
        if (node == null) return node;
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
